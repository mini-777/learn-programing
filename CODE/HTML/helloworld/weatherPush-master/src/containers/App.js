import React, {Component} from 'react';
import './App.css';
import MyMap from '../components/map';
import WeatherInfo from '../components/weatherInfo';
import mapApi from '../config/googleMap';
import weatherConfig from '../config/weather'
import axios from 'axios';
import Promise from 'bluebird';

class App extends Component {
	constructor(props) {
		super(props);

		this.state = {
			position: [],
			city: '',
			countryCode: '',
			weatherList: [],
			formatted_address: '',
			weatherDate: 0
		}
	}
	componentWillMount() {
		new Promise( (resolve, reject) => {
			navigator.geolocation.getCurrentPosition((p) => {
				// 아래 api 위도 경도가 조금 정확하지 않아서 html5 스펙인 geolocation 사용
				this.setState({
					position: [p.coords.latitude, p.coords.longitude]
				}, () => {resolve(p.coords)} )
			});
		})
		.then( (coords) => {
			return new Promise( (resolve, reject) => {
				axios.get('https://freegeoip.net/json/')
					.then((res) => {
						const data = res.data;
						this.setState({
							city: data.city,
							countryCode: data.country_code
						}, () => {resolve( {city: data.city, countryCode: data.country_code, coords: coords} )});
					})
					.catch((err) => {
						console.error(err);
					});
			})
		})
		.then( (data) => {
			return new Promise( (resolve, reject) => {
				axios.get(`http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=${weatherConfig.key}&q=${data.city},${data.countryCode}`)
					.then( (res) => {
						this.setState({
							weatherList: res.data.list
						}, () => {resolve(data.coords)});
					});
			})
		})
		.then( (coords) => {
			const geocoder = new window.google.maps.Geocoder;
			const latlng = {lat: coords.latitude, lng: coords.longitude};
			geocoder.geocode({'location': latlng}, (results, status) => {
				this.setState({
					formatted_address: results[results.length-1].formatted_address
				})
			});
		})

	}

	render() {
		const {
			position,
			weatherList,
			formatted_address
		} = this.state;
		return (
			<div className="app">
				<h1 className="app-title">날씨 알림 서비스</h1>
				<div className="map-wrap">
					<MyMap apiKey={mapApi.apiKey} center={position} zoom={16}></MyMap>
				</div>
				<section className="info-area">
					<p>
						{formatted_address? `당신은 ${formatted_address}에 위치하시군요.` : '위치를 탐색중입니다...'}
					</p>
					<ul className="weather-info-wrap">
						{weatherList.map((v, i) => {
							const now = new Date();
							const date = new Date(v.dt_txt).getDate();
							if( now.getDate() + this.state.weatherDate >= date ) {
								const hour = v.dt_txt.split(' ')[1].substr(0, 2);
								return (
									<WeatherInfo data={v} key={i} hour={hour} date={date}/>
								)
							}
						})}
					</ul>
				</section>
				<button className="btn" onClick={()=>{this.setState({weatherDate: this.state.weatherDate + 1});}}>더 보기</button>
			</div>
		);
	}
}

export default App;

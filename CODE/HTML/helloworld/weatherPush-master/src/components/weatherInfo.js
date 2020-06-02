import React, {Component} from 'react';

class WeatherInfo extends Component {

    calcCelsius(n) {
        // 켈빈 온도에서 섭씨로 변환
        return (parseFloat(n) - 273.15).toFixed(1);
    }
	render() {
        const {
            data,
            hour,
            date
        } = this.props;
        const {
            main,
            weather
        } = data;
	    return (
            <li className="weather-info-list">
                {date}일 {hour}시의 날씨는 {weather[0].main} 상태이며,<br/>
                최저기온은 {this.calcCelsius(main.temp_min)}도, 최고기온은 {this.calcCelsius(main.temp_max)}도 입니다.
            </li>
        );
	}
}

export default WeatherInfo;

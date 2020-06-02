const COORDS = 'coords';
const API_KEY = "9e17735ce593e83f07b2fd1965f01a01"
const weather1 = document.querySelector(".js-weather1");
const weather2 = document.querySelector(".js-weather2");
const weather3 = document.querySelector(".js-weather3");
const weather4 = document.querySelector(".js-weather4");
const weather5 = document.querySelector(".js-weather5");
const weather6 = document.querySelector(".js-weather6");
function saveCoords(coordsObj){
    localStorage.setItem(COORDS, JSON.stringify(coordsObj))
}
function finalWeather(string){
    const cutWeather = string.split('"');
    return cutWeather;
}
function getWeather(lat, lng){
    fetch(`https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lng}&APPID=${API_KEY}&units=metric`
    )
    .then(function(response){
        return response.json();
    })
    .then(function(json){
        const temperature = json.main.temp;
        const place = json.name;
        const weatherNow = JSON.stringify(json.weather[0].main);
        const lastWeather = finalWeather(weatherNow);
        
        weather1.innerText = `${lastWeather}`;
        weather2.innerText = `${lastWeather}`;
        weather3.innerText = `${lastWeather}`;
        weather4.innerText = `${lastWeather}`;
        weather5.innerText = `${lastWeather}`;
        weather6.innerText = `${lastWeather}`;

    })
}

function handleGeoSucces(position){
    const latitude = position.coords.latitude;
    const longitude = position.coords.longitude;
    const coordsObj = {
        latitude,
        longitude
    }
    saveCoords(coordsObj);
    getWeather(latitude, longitude);
}
function handleGeoError(){
    
}

function askForCoords(){
    navigator.geolocation.getCurrentPosition(handleGeoSucces, handleGeoError)
}


function loadCoords(){
    const loadedCoords = localStorage.getItem(COORDS);
    if(loadedCoords === null){
        askForCoords();
    } else {
        const parsedCoords = JSON.parse(loadedCoords);
        getWeather(parsedCoords.latitude, parsedCoords.longitude);
    }
}



function init(){
     loadCoords();
}
init();
var mapContainer = document.getElementById('map'), 
    mapOption = {
        center: new kakao.maps.LatLng(lat, lng), 
        level: 1 
    };  

  
var map = new kakao.maps.Map(mapContainer, mapOption); 
var geocoder = new kakao.maps.services.Geocoder();

var marker = new kakao.maps.Marker(), 
    infowindow = new kakao.maps.InfoWindow({zindex:1}); 

searchAddrFromCoords(map.getCenter(), displayCenterInfo);


kakao.maps.event.addListener(map, 'click', function(mouseEvent) {
    searchDetailAddrFromCoords(mouseEvent.latLng, function(result, status) {
        if (status === kakao.maps.services.Status.OK) {
            var detailAddr = !!result[0].road_address ? '<div>도로명주소 : ' + result[0].road_address.address_name + '</div>' : '';
            detailAddr += '<div>지번 주소 : ' + result[0].address.address_name + '</div>';
            
            var content = '<div class="bAddr">' +
                            '<span class="title">법정동 주소정보</span>' + 
                            detailAddr + 
                        '</div>';

         
            marker.setPosition(mouseEvent.latLng);
            marker.setMap(map);

            infowindow.setContent(content);
            infowindow.open(map, marker);
        }   
    });
});

kakao.maps.event.addListener(map, 'idle', function() {
    searchAddrFromCoords(map.getCenter(), displayCenterInfo);
});

function searchAddrFromCoords(coords, callback) {

    geocoder.coord2RegionCode(coords.getLng(), coords.getLat(), callback);         
}

function searchDetailAddrFromCoords(coords, callback) {
   
    geocoder.coord2Address(coords.getLng(), coords.getLat(), callback);
}

function displayCenterInfo(result, status) {
    if (status === kakao.maps.services.Status.OK) {
        var infoDiv = document.getElementById('centerAddr');

        for(var i = 0; i < result.length; i++) {
        
            if (result[i].region_type === 'H') {
                infoDiv.innerHTML = result[i].address_name;
                break;
            }
        }
    }    
}
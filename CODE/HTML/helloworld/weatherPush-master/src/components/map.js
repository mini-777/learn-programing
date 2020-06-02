import React, {Component} from 'react';
import GoogleMap from 'google-map-react';

class MyMap extends Component {
	render() {
		return (
			<GoogleMap bootstrapURLKeys={{key: this.props.apiKey, language: 'ko'}} center={this.props.center} zoom={this.props.zoom}></GoogleMap>
		);
	}
}

export default MyMap;

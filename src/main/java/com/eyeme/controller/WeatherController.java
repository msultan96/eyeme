package com.eyeme.controller;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;
import com.byteowls.jopencage.model.JOpenCageResult;
import com.eyeme.model.Weather.Weather;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@RequestMapping(value = "/{city}")
	public String getWeather(@PathVariable String city){
		JOpenCageLatLng coordinates = getLatLng(city);
		Weather weather = getWeather(coordinates.getLat(), coordinates.getLng());
		String temp = weather.getCurrently().getTemperature();
		return "The temperature is currently " + temp + " degrees in " + city;
	}

	private JOpenCageLatLng getLatLng(String city) {
		//create new API object with API Key
		JOpenCageGeocoder jOpenCageGeocoder = new JOpenCageGeocoder("03781bdf61174ae497dd404f6f17c2e4");
		//create request for LAT/LNG using city
		JOpenCageForwardRequest request = new JOpenCageForwardRequest(city);
		//retrieve response
		JOpenCageResponse response = jOpenCageGeocoder.forward(request);
		//We get the results independently because the API reverses the results after sorting
		//and uses the first element from the reverse order for the LAT/LNG
		//which ends up being the incorrect location
		List<JOpenCageResult> results = response.getResults();
		Collections.sort(results);
		return results.get(0).getGeometry();
	}

	private Weather getWeather(double latitude, double longitude){
		//Use RestTemplate to turn JSON response to POJO
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(
				"https://api.darksky.net/forecast/a223a8d3fa8c6c3a73c65ce724cc9fb3/"
						+ latitude +","+longitude,
				Weather.class);
	}


}

package com.eyeme.model.Weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Currently {
	private String summary;
	private String precipProbability;
	private String visibility;
	private String windGust;
	private String precipIntensity;
	private String icon;
	private String cloudCover;
	private String windBearing;
	private String apparentTemperature;
	private String pressure;
	private String dewPoint;
	private String ozone;
	private String nearestStormBearing;
	private String nearestStormDistance;
	private String temperature;
	private String humidity;
	private String time;
	private String windSpeed;
	private String uvIndex;
}

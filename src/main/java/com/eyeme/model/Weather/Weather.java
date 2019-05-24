package com.eyeme.model.Weather;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Weather {
	private Currently currently;
	private String offset;
	private String timezone;
	private String latitude;
	private Daily daily;
	private Flags flags;
	private Hourly hourly;
	private Minutely minutely;
	private String longitude;
}

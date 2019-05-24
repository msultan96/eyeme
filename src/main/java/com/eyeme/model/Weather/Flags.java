package com.eyeme.model.Weather;

import lombok.Data;

@Data
public class Flags {
	private String nearest_station;
	private String[] sources;
	private String units;
}

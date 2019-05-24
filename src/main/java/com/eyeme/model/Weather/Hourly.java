package com.eyeme.model.Weather;

@lombok.Data
public class Hourly {
	private String summary;
	private Data[] data;
	private String icon;
}

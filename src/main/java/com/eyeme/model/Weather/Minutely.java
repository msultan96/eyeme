package com.eyeme.model.Weather;

@lombok.Data
public class Minutely {
	private String summary;
	private Data[] data;
	private String icon;
}

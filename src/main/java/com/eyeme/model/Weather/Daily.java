package com.eyeme.model.Weather;

@lombok.Data
public class Daily {
	private String summary;
	private Data[] data;
	private String icon;
}

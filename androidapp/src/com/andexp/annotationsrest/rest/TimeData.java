package com.andexp.annotationsrest.rest;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeData {	
	
	@JsonProperty("time")
	private String time;
	
	@JsonProperty("milliseconds_since_epoch")
	private long millis;
	
	@JsonProperty("date")
	private String date;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("time : ").append(this.time).append("\n");
		builder.append("millis : ").append(this.millis).append("\n");
		return builder.toString();
	}
}

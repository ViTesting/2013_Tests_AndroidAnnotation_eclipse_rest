package com.andexp.annotationsrest.rest;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header {
	@JsonProperty("headers")
	HeaderData headerData;
	
	@JsonProperty("args")
	ArgsData argsData;

	public HeaderData getHeaderData() {
		return this.headerData;
	}
	
	public ArgsData getArgsData(){
		return this.argsData;
	}
}

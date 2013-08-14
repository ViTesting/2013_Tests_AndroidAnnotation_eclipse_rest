package com.andexp.annotationsrest.rest;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header {
	@JsonProperty("headers")
	HeaderData headerData;
	
	@JsonProperty("args")
	ArgsData args;

	@JsonProperty("json")
	ArgsData json;
	
	public HeaderData getHeaderData() {
		return headerData;
	}

	public void setHeaderData(HeaderData headerData) {
		this.headerData = headerData;
	}

	public ArgsData getArgs() {
		return args;
	}

	public void setArgs(ArgsData args) {
		this.args = args;
	}

	public ArgsData getJsonData() {
		return json;
	}
}

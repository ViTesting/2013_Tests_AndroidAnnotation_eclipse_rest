//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.andexp.annotationsrest.rest;

import java.util.Collections;
import java.util.HashMap;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class MyRestClient_
    implements MyRestClient
{

    private RestTemplate restTemplate;
    private String rootUrl;

    public MyRestClient_() {
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        rootUrl = "";
    }

    @Override
    public TimeData getTime() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.parseMediaType("application/json")));
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(httpHeaders);
        return restTemplate.exchange(rootUrl.concat("http://time.jsontest.com/"), HttpMethod.GET, requestEntity, TimeData.class).getBody();
    }

    @Override
    public Header getGetData(String id, String data) {
        HashMap<String, Object> urlVariables = new HashMap<String, Object>();
        urlVariables.put("id", id);
        urlVariables.put("data", data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.parseMediaType("application/json")));
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(httpHeaders);
        return restTemplate.exchange(rootUrl.concat("http://httpbin.org/get?id={id}&data={data}"), HttpMethod.GET, requestEntity, Header.class, urlVariables).getBody();
    }

    @Override
    public Header getHeader() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.parseMediaType("application/json")));
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(httpHeaders);
        return restTemplate.exchange(rootUrl.concat("http://httpbin.org/headers"), HttpMethod.GET, requestEntity, Header.class).getBody();
    }

    @Override
    public Header getPostedData(ArgsData argsData) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.parseMediaType("application/json")));
        HttpEntity<ArgsData> requestEntity = new HttpEntity<ArgsData>(argsData, httpHeaders);
        return restTemplate.exchange(rootUrl.concat("http://httpbin.org/post"), HttpMethod.POST, requestEntity, Header.class).getBody();
    }

}

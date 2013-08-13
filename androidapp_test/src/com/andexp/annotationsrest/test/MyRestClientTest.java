package com.andexp.annotationsrest.test;

import com.andexp.annotationsrest.rest.Header;
import com.andexp.annotationsrest.rest.MyRestClient_;
import com.andexp.annotationsrest.rest.TimeData;

import android.test.AndroidTestCase;

public class MyRestClientTest extends AndroidTestCase {
	public void testGetTime() {
		TimeData time = new MyRestClient_().getTime();
		assertNotNull(time.getDate());
		assertTrue(time.getMillis() + 2000 > System.currentTimeMillis()); // add 2 seconds to count latency
	}
	
	public void testGetHeaders(){
		Header header = new MyRestClient_().getHeader();
		assertTrue(header.getHeaderData().getUserAgent().length() > 10);
	}
	
	public void testGetVersionRest() {
		String idTest = "toto";
		String dataTest = "myData";
		Header data = new MyRestClient_().getGetData("toto", "myData");
		assertEquals(idTest, data.getArgsData().getId());
		assertEquals(dataTest, data.getArgsData().getData());
	}

}

package com.study.webservices;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8882/ws/person", new PersonServiceImpl());  
	}

}
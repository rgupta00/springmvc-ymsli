package com;

import javax.xml.ws.Endpoint;

public class Main {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/cal", new Calculator());
		System.out.println("hello world...");
	}

}

package com.designpattern.example;

import java.util.logging.Handler;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		com.designpattern.example.Handler h1=new RequestHandler_1();
		com.designpattern.example.Handler h2=new RequestHandler_2();
		com.designpattern.example.Handler h3=new RequestHandler_3();
		
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		//h3.setSuccessor(h1);
		
		h1.handleRequest("R8");

	}

}

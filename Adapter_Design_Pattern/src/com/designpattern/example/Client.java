package com.designpattern.example;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Target tob=new Adapter();
		tob.sayHello();
		
	}

}

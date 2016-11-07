package com.designpattern.example;

public interface Handler {

	void setSuccessor(Handler handler);
	
	void handleRequest(String request);

}

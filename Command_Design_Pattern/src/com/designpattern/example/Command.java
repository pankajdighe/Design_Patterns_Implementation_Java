package com.designpattern.example;

public interface Command {
	
	void execute();
	void setReciever(Receiver target);

}

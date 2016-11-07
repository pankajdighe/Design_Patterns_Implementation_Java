package com.designpattern.example;

public class MenuItem implements Invoker{

	Command thisCommand;
	
	public void setCommand(Command cmd) {
		thisCommand=cmd;
	}

	public void invoke() {
		thisCommand.execute();
	}
	

}

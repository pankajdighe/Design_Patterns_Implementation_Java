package com.designpattern.example;

public class ConcreteCommand implements Command {
	
	private Receiver theReceiver;

	public void execute() {

		theReceiver.doAction();
	}

	public void setReciever(Receiver target) {
		
		theReceiver=target;
	}

}

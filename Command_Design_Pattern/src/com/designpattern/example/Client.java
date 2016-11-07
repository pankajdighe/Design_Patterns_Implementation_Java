package com.designpattern.example;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String helloMsg="Hello!!";
		final String byeMsg="Bye!!";
		
		Menu menu=new Menu();
		
		MenuItem helloItem=new MenuItem();
		MenuItem byeItem=new MenuItem();
		
		Command helloCommand=new ConcreteCommand();
		Command byeCommand=new ConcreteCommand();
		
		helloCommand.setReciever(new Receiver() {
			
			public void doAction() {

				System.out.println(helloMsg);
			}
		});
		
		byeCommand.setReciever(new Receiver() {
			
			public void doAction() {
				System.out.println(byeMsg);
				
			}
		});
		
		helloItem.setCommand(helloCommand);
		byeItem.setCommand(byeCommand);
		
		menu.addMenuItems("SayHello", helloItem);
		menu.addMenuItems("SayBye", byeItem);
		
		menu.selectMenuItem("SayBye");
		

	}

}

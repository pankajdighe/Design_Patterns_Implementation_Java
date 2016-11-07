package com.compositedesignpattern.example;

public class BuildOrder {
	
	public static Component  buildOrder(){
		
		
		Component order=new Directory("root");
		
		order.addChild(new File("Potato.txt"));
		order.addChild(new File("Tomato.txt"));
		order.addChild(new File("Chillie.png"));
		
		
		Component homeutensils=new Directory("HomeUtemsilsFolder");
		
		homeutensils.addChild(new File("Soap.txt"));
		homeutensils.addChild(new File("cleaner.txt"));
		homeutensils.addChild(new File("container.png"));
		homeutensils.addChild(new File("table.txt"));
		
		order.addChild(homeutensils);
		
		
		
		
		return order;
		
		
	}

}

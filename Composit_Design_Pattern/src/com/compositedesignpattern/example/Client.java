package com.compositedesignpattern.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Component order=BuildOrder.buildOrder();
		
		//order.printDescription();
		
		HashSet<Component> list=order.getAllchilds();
		
		String command="ls";
		
		if(command.equals("ls")){
			
		for(Component c:list){
			
			c.printComponentName();
			
		}
		
		}
		
		command="cd HomeUtemsilsFolder";
		
		if(command.contains("cd")){
		
			Component curr_dir=order.searchComponent("HomeUtemsilsFolder");
			
			if(curr_dir==null)
				System.out.println("No Dir Found");
			else
			for(Component c:curr_dir.getAllchilds()){
				
				c.printComponentName();
				
			}
			
		}
		
		
	}

}

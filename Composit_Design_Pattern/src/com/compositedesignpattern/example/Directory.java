package com.compositedesignpattern.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Directory implements Component {
	
	private HashSet<Component> list=new HashSet<Component>();
	private String description;
	
	private String name;
	
	public Directory(String name){
		
		this.name=name;
		
	}

	public Component getChild(String item_name) {
		
	
		return null;
	}

	public void addChild(Component c) {

		list.add(c);
	}

	public void removeChild(Component c) {

		list.remove(c);
	}

	public void printDescription() {
		
		System.out.println("***Category***");
		System.out.println(description);
		
		for(Component c:list){
			
			c.printDescription();
			
		}
		
	}
	
	public HashSet<Component> getAllchilds(){
		
		return this.list;
	}

	public void printComponentName() {
		
		System.out.println(this.name);		
	}

	public Component getChild(int item) {
		// TODO Auto-generated method stub
		return null;
	}

	public Component searchComponent(String component_name) {
		
		System.out.println("Searing Component "+component_name);
		
		if(list.size()>0){
			
			//if(list.contains(component_name)){
				
				for(Component c:list){
					
					if(c.getComponentName().equals(component_name)){
						
						return c;
						
					}
					
				}
				
		//	}
			
		}
		
		return null;
	}

	public String getComponentName() {
		return this.name;
	}

}

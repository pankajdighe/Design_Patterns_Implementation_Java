package com.compositedesignpattern.example;

import java.util.ArrayList;
import java.util.HashSet;

public class File implements Component {
	
	private String description;
	private String name;
	
	public File(String name){
		
	this.name=name;
		
	}

	public Component getChild(int item) {
		return this;
	}

	public void addChild(Component c) {
		
	}

	public void removeChild(Component c) {
		
	}

	public void printDescription() {
		
		System.out.println(this.description);
		
	}

	public HashSet<Component> getAllchilds() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printComponentName() {
		// TODO Auto-generated method stub
		
		System.out.println(this.name);
		
	}

	public Component searchComponent(String component_name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getComponentName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}

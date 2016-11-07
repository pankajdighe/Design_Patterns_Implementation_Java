package com.designpattern.example;

import java.util.HashMap;

public class Menu {
	
	private HashMap<String,MenuItem> menuItems=new HashMap<String,MenuItem>();
	
	public void addMenuItems(String key,MenuItem item){
		
		menuItems.put(key, item);
		
	}
	
	public void selectMenuItem(String key){
		
		MenuItem item=menuItems.get(key);
		
		if(item!=null){
			item.invoke();
		}else{
			
			System.out.println("Element not Found...!!!");
		}
	}

}

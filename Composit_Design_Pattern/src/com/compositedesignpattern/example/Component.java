package com.compositedesignpattern.example;

import java.util.HashSet;

public interface Component {
	
	
	Component getChild(int item);
	void addChild(Component c);
	void removeChild(Component c);
	void printDescription();
	HashSet<Component>  getAllchilds();
	void printComponentName();
	Component searchComponent(String component_name);
	String getComponentName();

}

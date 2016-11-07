/**
 * 
 */
package com.designpattern.example;

/**
 * @author pankaj
 *
 */
public class Adapter extends AdapteeParent implements Target {

	public void sayHello() {

		super.sayHello_old("Demo");
	}
	

}

/**
 * 
 */
package com.jay.creational.factory;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class Dog implements Animal {
	public Dog() {

	}

	@Override
	public void makeSound() {
		System.out.println("Woof");
	}
}

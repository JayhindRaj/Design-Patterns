/**
 * 
 */
package com.jay.creational.factory;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class AnimalFactory {
	public Animal getAnimal(String animal) {
		if("dog".equals(animal)) {
			return new Dog();
		} else if("cat".equals(animal)){
			return new Cat();
		} else {
			return null;
		}
	}
}

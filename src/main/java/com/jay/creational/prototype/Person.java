/**
 * 
 */
package com.jay.creational.prototype;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class Person implements Prototype {

	private String name;
	public Person(String name) {
		this.name = name;
	}

	@Override
	public Prototype doClone() {

		return new Person(name);
	}

	@Override
	public String toString() {
		return "This person is named " + name;
	}
}

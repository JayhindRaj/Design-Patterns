/**
 * 
 */
package com.jay.structural.composite;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 14, 2018
 */
public class Leaf implements Component {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {

	}

	@Override
	public void sayGoodbye() {
		System.out.println("Goodbye!!! " + name);

	}

}

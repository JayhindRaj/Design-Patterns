/**
 * 
 */
package com.jay.behavioural.iterator;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class Item {
	private String name;
	private double price;

	@Override
	public String toString() {
		return "Item [name=" + name + " : price= $" + price + "]";
	}

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
}

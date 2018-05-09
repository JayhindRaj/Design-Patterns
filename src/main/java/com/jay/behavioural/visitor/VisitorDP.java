package com.jay.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitor pattern is used when we have to perform an operation on a group of
 * similar kind of Objects. With the help of visitor pattern, we can move the
 * operational logic from the objects to another class.
 * 
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class VisitorDP {
	public static void main(String[] args) {
		List<ItemElement> items = new ArrayList<ItemElement>();
		items.add(new Book(56, "ISBN4581230"));
		items.add(new Fruit(35, 2, "Papaya")); 
		items.add(new Fruit(20, 3, "Water melon"));
		items.add(new Book(47, "ISBN4513320"));
		int total = ShoppingCartClient.calculatePrice(items);
		System.out.println("Total Cost: " + total);
	}
}

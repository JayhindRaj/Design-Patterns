/**
 * 
 */
package com.jay.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class Menu {

	/**
	 * 
	 */
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	List<Item> items;

	public Menu(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		if(this.items == null) {
			this.items = new ArrayList<Item>();
		}
		this.items.add(item);
	}

	public MenuIterator iterator() {
		return new MenuIterator();
	}

	class MenuIterator implements Iterator<Item> {
		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= items.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Item next() {
			return items.get(currentIndex++);
		}

		@Override
		public void remove() {
			items.remove(--currentIndex);
		}
	}
}

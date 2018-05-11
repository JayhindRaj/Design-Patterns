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
public class Menu1<T> {
	List<T> items;

	public Menu1() {
		items = new ArrayList<>();
	}

	public Menu1(List<T> list) {
		this.items = list;
	}

	public void add(T t) {
		if (items == null) {
			items = new ArrayList<T>();
		}
		items.add(t);
	}

	public Menu1Iterator iterator() {
		return new Menu1Iterator();
	}

	class Menu1Iterator implements Iterator<T> {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= items.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public T next() {
			return items.get(currentIndex++);
		}

		@Override
		public void remove() {
			items.remove(--currentIndex);
		}
	}
}

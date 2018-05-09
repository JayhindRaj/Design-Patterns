package com.jay.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

class ShopingCart {
	List<Item> items;

	public ShopingCart() {

	}

	public ShopingCart(List<Item> items) {
		super();
		this.items = items;
	}

	public boolean addItem(Item item) {
		if (this.items == null) {
			this.items = new ArrayList<Item>();
		}
		return this.items.add(item);
	}

	private double calculateTotal() {
		int total = 0;
		for (Item i : items) {
			total = total + i.getPrice();
		}
		return total;
	}

	public void pay(PaymentStrategy paymentStrategy) {
		double amount = calculateTotal();
		paymentStrategy.payment(amount);
	}
}
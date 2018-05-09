package com.jay.behavioural.strategy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Strategy pattern is used when we have multiple algorithm for a specific task
 * and client decides the actual implementation to be used at runtime
 * 
 * @author jayrajpo
 */
public class StrategyDP {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("ASX674634", 314));
		items.add(new Item("KSO696484", 458));
		items.add(new Item("VXS653454", 1234));
		
		ShopingCart cart = new ShopingCart(items);
		
		PaymentStrategy paymentStrategy;
		cart.addItem(new Item("4511312SAN", 1200));

		cart.addItem(new Item("4511312SAN", 561));
		cart.addItem(new Item("4576412LVE", 131));
		cart.addItem(new Item("4545452PNZ", 381));
		cart.addItem(new Item("7844312DST", 420));
		
		Calendar calendar = Calendar.getInstance();

		paymentStrategy = new DebitCreditPayment("4363030401188586", "458",
				calendar.getTime(), "ABC xyz");

//		 paymentStrategy = new PayPalPayment("jayhindit3033@gmail.com",
//		 "AGJ%aDH@J");

		cart.pay(paymentStrategy);
	}
}





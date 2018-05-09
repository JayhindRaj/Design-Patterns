package com.jay.behavioural.strategy;

import java.util.ArrayList;
import java.util.Date;
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

interface PaymentStrategy {
	public void payment(double amount);
}

class DebitCreditPayment implements PaymentStrategy {
	private String cardNumber;
	private String cvvNumber;
	private Date expiryDate;
	private String chName;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public DebitCreditPayment(String cardNumber, String cvvNumber,
			Date expiryDate, String chName) {
		super();
		this.cardNumber = cardNumber;
		this.cvvNumber = cvvNumber;
		this.expiryDate = expiryDate;
		this.chName = chName;
	}

	@Override
	public void payment(double amount) {
		System.out.println(amount + " paid by " + chName
				+ " using credit/debit card");

	}

}

class PayPalPayment implements PaymentStrategy {

	private String emailId;
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	private String pswd;

	public PayPalPayment(String email, String pswd) {
		this.emailId = email;
		this.pswd = pswd;
	}

	@Override
	public void payment(double amount) {
		System.out.println(amount + " paid by Paypal..");
	}
}

class Item {

	private String upcCode;
	private int price;

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Item(String upcCode, int price) {
		super();
		this.upcCode = upcCode;
		this.price = price;
	}
}

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
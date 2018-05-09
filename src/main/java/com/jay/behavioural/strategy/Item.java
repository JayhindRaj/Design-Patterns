package com.jay.behavioural.strategy;

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


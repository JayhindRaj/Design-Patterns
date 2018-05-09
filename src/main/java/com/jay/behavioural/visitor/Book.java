/**
 * 
 */
package com.jay.behavioural.visitor;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class Book implements ItemElement {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.jay.behavioural.visitor.ItemElement#accept(com.jay.behavioural.visitor
	 * .ShoppingCartVisitor)
	 */
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	private int price;
	private String isbnNumber;

	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

}

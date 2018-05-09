/**
 * 
 */
package com.jay.behavioural.visitor;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class ShopingCartVisitorImpl implements ShoppingCartVisitor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.jay.behavioural.visitor.ShoppingCartVisitor#visit(com.jay.behavioural
	 * .visitor.Book)
	 */
	@Override
	public int visit(Book book) {
		int cost = 0;

		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
		}

		System.out.println("Book ISBN: " + book.getIsbnNumber() + " Cost :"
				+ cost);
		return cost;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.jay.behavioural.visitor.ShoppingCartVisitor#visit(com.jay.behavioural
	 * .visitor.Fruit)
	 */
	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost :" + cost);
		return cost;
	}

}

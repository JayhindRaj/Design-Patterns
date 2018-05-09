/**
 * 
 */
package com.jay.behavioural.visitor;

import java.util.List;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class ShoppingCartClient {
	public static int calculatePrice(List<ItemElement> items) {
		ShopingCartVisitorImpl cartVisitorImpl = new ShopingCartVisitorImpl();
		int sum = 0;
		for (ItemElement element : items) {
			sum = sum + element.accept(cartVisitorImpl);
		}
		return sum;
	}
}

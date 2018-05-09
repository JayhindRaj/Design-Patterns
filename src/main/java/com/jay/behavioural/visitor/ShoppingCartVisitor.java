/**
 * 
 */
package com.jay.behavioural.visitor;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}

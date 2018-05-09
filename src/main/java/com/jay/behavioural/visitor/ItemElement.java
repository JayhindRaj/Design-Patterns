/**
 * 
 */
package com.jay.behavioural.visitor;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}

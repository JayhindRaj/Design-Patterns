/**
 * 
 */
package com.jay.behavioural.chainofrespo;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public abstract class Dispenser {
	Dispenser successor;

	public void setSuccessor(Dispenser successor) {
		this.successor =  successor;
	}

	public abstract void dispense(int amount);
}

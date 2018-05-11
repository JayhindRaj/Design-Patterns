/**
 * 
 */
package com.jay.behavioural.chainofrespo;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class Rs50Dispenser extends Dispenser {
	public Rs50Dispenser() {
	}

	@Override
	public void dispense(int amount) {
		if((amount % 50) !=0) {
			System.out.println("Please enter the amount in multiple of 50");
			return;
		}
		if(amount < 50) {
			if(successor!= null) {
				successor.dispense(amount);	
			}

		} else {
			int note = amount / 50;
			System.out.println(note + " notes of 50 dispensed..");
			amount = amount - (50 * note);
			if(amount > 0) {
				if(successor!= null) {
					successor.dispense(amount);	
				}	
			}
		}
	}
}

/**
 * 
 */
package com.jay.creational.prototype;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class Dog implements Prototype {
	private String sound;

	public Dog(String sound) {
		this.sound = sound;
	}

	@Override
	public Prototype doClone() {
		return new Dog(sound);
	}

	@Override
	public String toString() {
		return "This dog says " + sound;
	}
}

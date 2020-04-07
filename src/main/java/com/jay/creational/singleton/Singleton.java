package com.jay.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{

	private static Object lock = new Object();
	private static final long serialVersionUID = 6452366080845723439L;
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized (lock) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public Object readResolve() {
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return Singleton.getInstance();
//		return super.clone();
	}
}

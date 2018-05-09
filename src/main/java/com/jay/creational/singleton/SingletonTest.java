package com.jay.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.hashCode());
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.hashCode());
		
		
		// Checking Singleton behavioue in Cloning 
		try {
			Singleton singleton3 = (Singleton) singleton2.clone();
			System.out.println(singleton3.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

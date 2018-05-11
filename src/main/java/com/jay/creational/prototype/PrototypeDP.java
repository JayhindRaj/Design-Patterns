package com.jay.creational.prototype;

public class PrototypeDP {

	public static void main(String[] args) {
		Person p1 = new Person("Jayhind");
		System.out.println(p1);
		Person p2 = (Person) p1.doClone();
		System.out.println(p2);
		Dog dog = new Dog("Woof");
		System.out.println(dog);
		Dog dog2 =  (Dog) dog.doClone();
		System.out.println(dog2);
	}
}

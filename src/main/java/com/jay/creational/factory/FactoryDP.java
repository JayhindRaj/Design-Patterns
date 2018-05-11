package com.jay.creational.factory;

public class FactoryDP {

	public static void main(String[] args) {

		AnimalFactory animalFactory = new AnimalFactory();

		Animal cat = animalFactory.getAnimal("cat");
		cat.makeSound();
		Animal dog = animalFactory.getAnimal("dog");

		dog.makeSound();
	}
}

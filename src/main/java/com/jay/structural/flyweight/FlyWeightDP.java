package com.jay.structural.flyweight;

public class FlyWeightDP {

	public static void main(String[] args) {
		FlyweightFactory factory = FlyweightFactory.getInstance();

		for (int i = 1; i <= 200; i++) {
			factory.getFlyweight("add").doMath(i, i + 3);
			factory.getFlyweight("mul").doMath(i, i + 5);
			factory.getFlyweight("subs").doMath(i*2, i + 5);
		}
	} 
}
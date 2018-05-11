/**
 * 
 */
package com.jay.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class FlyweightFactory {
	private static FlyweightFactory instance;
	private Map<String, FlyWeight> map;

	private FlyweightFactory() {
		map = new HashMap<>();
	}

	public static FlyweightFactory getInstance() {
		if (instance == null) {
			instance = new FlyweightFactory();
		}
		return instance;
	}

	public FlyWeight getFlyweight(String key) {
		if (map.containsKey(key)) {
			return map.get(key);
		} else {
			FlyWeight flyWeight = null;
			if (key.contains("add")) {
				flyWeight = new FlyWeightAdder();
			} else if(key.contains("mul")){
				flyWeight = new FlyweightMultiplier();
			} else {
				flyWeight = new FlyWeightSubstarctor();
			}

			map.put(key, flyWeight);
			return flyWeight;
		}
	}
}

package com.dinesh.patterns.enums;

public enum CoffeeType {

	FILTER("Filter Coffee"), MOCHA(" Mocha "), BLACKCOFFEE(" Black Coffee"), UNK("Unknow Coffer Type");

	private String coffeeType;

	CoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}

	public String coffeeType() {
		return coffeeType;
	}
}

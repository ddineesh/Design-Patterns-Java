package com.dinesh.patterns.enums;

public enum CoffeeSize {

	LARGE("Large Size"), MEDIUM("Medium Size"), SMALL(" Small Size");

	private String size;

	CoffeeSize(String size) {
		this.size = size;
	}

	public String coffeeSize() {
		return size;
	}

}

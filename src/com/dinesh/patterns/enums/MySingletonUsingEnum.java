package com.dinesh.patterns.enums;

public enum MySingletonUsingEnum {
	INSTANCE;
	
}



/*
 * public enum MySingletonUsingEnum { 
 * INSTANCE; 
 * private MySingletonUsingEnum() {
 * System.out.println("Here"); }
 * 
 * public String retrieveSomething() { return "DUMMY"; }
 * 
 * }
 */
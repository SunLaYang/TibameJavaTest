package com.ryan.test;

public class Dogg extends Animal1{
	
	private String name;
	
	public Dogg(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}

package com.ryan.test;

import java.io.Serializable;

public abstract class Animal1 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public String name;
	
	public abstract void speak();
	
	public Animal1() {
		super();
	}

}

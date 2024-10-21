package com.app.fruits;

public class Apple extends fruit {
	

	@Override
	void taste() {
		System.out.println(" sour");
		// TODO Auto-generated method stub
		
	}

	public Apple(String color, float weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	public Apple() {
		// TODO Auto-generated constructor stub
	}
	public void accept() {
		super.accept(null);
	}
}

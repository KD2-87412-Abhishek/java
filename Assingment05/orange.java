package com.app.fruits;

public class orange extends fruit {
	

	public orange(String color, float weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	public orange() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void taste() {
		System.out.println(" orange");
		// TODO Auto-generated method stub
		
	}
	public void accept() {
		super.accept(null);
	}
}

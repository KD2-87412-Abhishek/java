package com.app.fruits;

import java.util.Scanner;

public class Mango extends fruit {
	
	

	public Mango(String color, float weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	public Mango() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		System.out.println(" Sweet");
		// TODO Auto-generated method stub

		}
	public void accept() {
		super.accept(null);
	}
	}



package com.app.fruits;

import java.util.Scanner;

public abstract class fruit {
	String color;
	float weight;
	String name;
	boolean isFresh;
	public fruit(String color, float weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
		
	}
	public fruit() {
	}
	@Override
	public String toString() {
		return "fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	abstract void taste(); 
		
	public void accept(Scanner sc) {
		System.out.print("enter fruit detail ");
		System.out.print("name ");
		name=sc.next();
		System.out.print("color");
		color=sc.next();
		System.out.print("weight");
		weight=sc.nextFloat();
//		isfresh=sc.nextBoolean();
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

}

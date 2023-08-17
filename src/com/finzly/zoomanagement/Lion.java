package com.finzly.zoomanagement;

public class Lion extends Animal{
	public Lion(String name, int age) {
		super(name,age);
	}
	@Override
	public void sound() {
		System.out.println("lion roars");
	}
}

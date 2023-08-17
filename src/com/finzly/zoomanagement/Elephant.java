package com.finzly.zoomanagement;

public class Elephant extends Animal{
 public Elephant(String name, int age) {
	 super(name,age);
 }
 @Override
 public void sound() {
	 System.out.println("elephant sound");
 }
}

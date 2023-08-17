package com.finzly.antivirus;

public class Antivirus {

	public Antivirus() {
		System.out.println("You are using free version ! Please upgrade.");
	}

	public Antivirus(String productKey) {
		System.out.println("Thank you for purchasing our full version !");
	}
}

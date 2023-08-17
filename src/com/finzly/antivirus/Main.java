package com.finzly.antivirus;

public class Main {
	public static void main(String[] args) {
		
		// for people using free version:
		Antivirus av1 = new Antivirus();
		
		
		Antivirus av2 = new Antivirus(new Transaction().getProductKey());
		
		
	}
}

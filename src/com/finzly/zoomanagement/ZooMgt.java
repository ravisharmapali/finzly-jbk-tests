package com.finzly.zoomanagement;

import java.util.Scanner;

public class ZooMgt {
	public static void main(String[] args) {
		Animal animals[] = { new Elephant("Ramu", 8), new Lion("Sher", 4) };

		for (int i = 0; i < animals.length; i++) {

			animals[i].sound();

		}

		// or else enter by mgt:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many animals : ");
		int count = scanner.nextInt();
		Animal animals2[] = new Animal[count];
		for (int i = 0; i < animals2.length; i++) {
			System.out.println("enter name ");
			animals2[i].setName(scanner.nextLine());
			System.out.println("Enter age ");
			animals2[i].setAge(scanner.nextInt());
		}

		for (Animal a : animals2) {
			System.out.println(" name " + a.getName() + " age " + a.getAge());
		}
	}
}

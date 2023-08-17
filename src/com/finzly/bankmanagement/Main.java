package com.finzly.bankmanagement;

public class Main {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(111, "Ravi", 5500);
		BankAccount account2 = new BankAccount(1112, "Harsh", 9500);

		account1.deposite(6000);
		account2.withdraw(6000);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
	}
}

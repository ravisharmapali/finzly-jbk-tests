package com.finzly.bankmanagement;

public class BankAccount {
	private int acNum;
	private String acName;
	private double acBal;

	public BankAccount(int acNum, String acName, double acBal) {
		this.acNum = acNum;
		this.acName = acName;
		this.acBal = acBal;
	}
	
	
	
	public void deposite(double amt) {
		if (amt < 0) {
			System.out.println("Invalid deposit amt!");
		} else {
			this.acBal = this.acBal + amt;
		}
	}

	public void withdraw(double amt) {
		if (amt > this.acBal) {
			System.out.println("invalid amout!");
		} else {
			this.acBal = this.acBal - amt;
			System.out.println("withdraw success!");
		}
	}

	public double getBalance() {
		return this.acBal;
	}
}

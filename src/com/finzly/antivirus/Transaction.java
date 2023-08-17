package com.finzly.antivirus;

public class Transaction {

	private String productKey;

	public Transaction() {
		productKey = String.valueOf(Math.random() * 1000);
	}
	
	public String getProductKey() {
		return this.productKey;
	}
}

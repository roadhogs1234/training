package com.example;

public class SBIBank implements Loan{
	@Override
	public void interestRate(int amount) {
		System.out.println("Interest ="+(amount*11/100));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

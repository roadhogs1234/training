package com.example;

public class Bank{
	int amount = 2000;
	void balance() {
		System.out.println("Account Balance is: "+amount);
		
	}
	void withdraw(int amount) {
		if(amount>this.amount) {
			System.out.println("Insufficient Balance");
		}
		else {
			this.amount+=amount;
		}
	}
	void deposit(int amount) {
		this.amount+=amount;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.balance();
		b1.withdraw(500);
		b1.balance();
		b1.deposit(10000);
		b1.balance();
		b1.withdraw(20900);

	}

}

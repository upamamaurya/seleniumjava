package com.hdfc.loans.carloans;

public class Hdfc implements Rbi
{
	public static void main(String[] args)
	{
		
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawal();
	}

	@Override
	public void withdrawal() {
		System.out.println("I am overridden withdrawal from HDFC...");
	}

	@Override
	public void deposit() {
		System.out.println("I am overridden Deposit from HDFC...");
	}

}

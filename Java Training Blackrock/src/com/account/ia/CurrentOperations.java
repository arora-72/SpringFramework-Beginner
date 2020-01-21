package com.account.ia;

public class CurrentOperations implements Operation {
	Double amt;
	Double intr = 15.00;
	
	public CurrentOperations(Double amt) {
		// TODO Auto-generated constructor stub
		this.amt = amt;
	}

	@Override
	public void interest(Double amt) {
		// TODO Auto-generated method stub
		System.out.println("your updated balance is " + amt * this.intr);
	}
	
	
	

}

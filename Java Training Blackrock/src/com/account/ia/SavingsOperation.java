package com.account.ia;

public class SavingsOperation implements Operation{

	
	Double amt;
	Double intr = 9.00;
	
	public SavingsOperation(Double balance) {
		// TODO Auto-generated constructor stub
		this.amt = balance;
	}

	
//	public void interest() {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void interest(Double amt) {
		// TODO Auto-generated method stub
		System.out.println("updated price is :" + (this.amt * this.intr));
	}

	
	
	

}

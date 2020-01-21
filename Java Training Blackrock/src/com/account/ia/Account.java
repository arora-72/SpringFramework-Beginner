package com.account.ia;

public class Account implements AccountFunctions{
	
	private String name;
	private String accNo;
	private Double balance;
	private String accountType;
	
	private static Double c = (double) 1001;
	
	public Account(String name, Double balance, String accountType) {
		c++;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
		this.accNo = "ACC - " + c;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAccNo(String accNo) {
		
		this.accNo = accNo;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		
		this.balance = balance;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public void calculateInterest(String act) {
		// TODO Auto-generated method stu
		if(act.equals("Savings")) {
			new SavingsOperation(balance);
		}else {
			new CurrentOperations(balance);
		}
	}
	
	
	

	
	
}

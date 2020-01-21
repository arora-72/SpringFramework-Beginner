package com.account.ia;
import java.util.Scanner;  // Import the Scanner class


public class Test {
	
	
    
  
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);  // Create a Scanner object
		System.out.println("enter name\n");
	    String userName = in.nextLine();  // Read user input
	    System.out.println("\n enter account type\n");
	    String accType = in.nextLine();
	    System.out.println("\n Balance\n");
	    Double balance = in.nextDouble();
	    
	    Account ac1 = new Account(userName, balance, accType);
	    
	    System.out.println("name" + userName);
	    System.out.println("balance" + balance);
	    
	    ac1.calculateInterest(accType);
	    
	    
	   

	}

	
	
	

}

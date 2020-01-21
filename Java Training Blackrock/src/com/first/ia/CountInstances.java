package com.first.ia;

public class CountInstances {
	
	private static int count;
	
	public CountInstances() {
		// TODO Auto-generated constructor stub
		count++;
	}
	
	public static int getMyInstances() {
		return count;
	}
	
//public static void main (String[] args) {
//		
////	CountInstances c1 = new CountInstances();
////	CountInstances c2 = new CountInstances();
////	CountInstances c3 = new CountInstances();
//	
//	new CountInstances();
//	new CountInstances();
//	new CountInstances();
//	
//	
//	System.out.println("instances created as " + CountInstances.getMyInstances());
//	}
//	

}



package com.lti.manual;

import com.lti.java.SavingsAccount;

public class Test1 { 
	public static void main(String[] args) {
		double currentBalance=5000;
		SavingsAccount savObj = new SavingsAccount(101,"Julie", currentBalance);
		System.out.println("savObj : "+savObj);
		
		double amountToWithdraw=2000;
		double amountToDeposit=2000;
		
		savObj.deposit(amountToDeposit);

		double expectedBalance = currentBalance + amountToDeposit;
		
		if(expectedBalance == savObj.getAccountBalance()) {
			
			System.out.println("deposit passed");
			
		}
		else {
			System.out.println("Expected : "+expectedBalance+" But Found : "+savObj.getAccountBalance());
			System.out.println("deposit failed!!!");
		}
		
	
		System.out.println("savObj : "+savObj);
		
	}
}


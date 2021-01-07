package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Taxes tx = new Taxes();
		
		System.out.println("This salary will be taxed at " + tx.percentageSalaryToBeTaxed(33000) + "%");
		
		System.out.println("This salary will be taxed for " + tx.exactSalaryToBeTaxed(23000) + "£");
		
		
	}

}

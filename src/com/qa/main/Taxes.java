package com.qa.main;

public class Taxes {
	
	public float percentageSalaryToBeTaxed(float salary) {
		/*
		0 - 14,999 : 0% tax
		15,000 - 19,999 : 10% tax
		20,000 - 29,999 : 15% tax
		30,000 - 44,999 : 20% tax
		45,000+ : 25% tax
		*/
		float percTaxed = 0;
		
		if(salary < 15000) {
			
			percTaxed = 0;
			
		}else if(salary >= 15000 && salary < 20000) {
			
			percTaxed = 10;
			
		}else if(salary >= 20000 && salary < 30000) {
			
			percTaxed = 15;
			
		}else if(salary >= 30000 && salary < 45000) {
			
			percTaxed = 20;
			
		}else {
			
			percTaxed = 25;
			
		}
		
		
		return percTaxed;
		
		
	}
	
	public float exactSalaryToBeTaxed(float salary) {
		
		float amountTaxed = 0f;
		
		float percTaxed = percentageSalaryToBeTaxed(salary);
		
		if(salary < 15000) {
			
			//percTaxed = 0;
			
		}else if(salary >= 15000 && salary < 20000) {
			
			//percTaxed = 10;
			amountTaxed = salary * (percTaxed/100);
			
		}else if(salary >= 20000 && salary < 30000) {
			
			//percTaxed = 15;
			amountTaxed = salary * (percTaxed/100);
			
		}else if(salary >= 30000 && salary < 45000) {
			
			//percTaxed = 20;
			amountTaxed = salary * (percTaxed/100);
			
		}else {
			
			//percTaxed = 25;
			amountTaxed = salary * (percTaxed/100);
			
		}
		
		
		return amountTaxed;
		
	}
	

}

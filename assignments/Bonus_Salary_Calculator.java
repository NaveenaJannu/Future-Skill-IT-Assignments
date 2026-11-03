package com.futureskillit.assignments;

import java.util.Scanner;

public class Bonus_Salary_Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double performanceBonus = 0;
		double totalSalary = 0;
		double bonusAmount = 0;
		double serviceBonus = 0;
		double totalBonus = 0;

		System.out.print("Enter employee salary:");
		double salary = sc.nextDouble();

		System.out.print("\nEnter performance rating (1-5): ");
		int rating = sc.nextInt();

		System.out.print("\nEnter years of experience:");
		int exp = sc.nextInt();

		if (rating < 1 || rating > 5 || exp < 0 || salary <= 0) {
			
			System.out.println("Reject");
		} 
		else {
			if (rating == 5) 
				performanceBonus = 0.20;
			else if(rating == 4)
				performanceBonus = 0.15;
			else if(rating == 3)
				performanceBonus = 0.10;
			else
				performanceBonus = 0.0;
			
			if(exp > 5 && rating>=3 && rating<=5 )
				serviceBonus = 0.05;
		
		
		totalBonus  = performanceBonus+serviceBonus;
		bonusAmount = salary*totalBonus;
		totalSalary = salary+bonusAmount;
		
		}
		
		System.out.println("Performance Bonus: "+performanceBonus+ "\n"
						   +"Service Bonus: "+serviceBonus+ "\n"
						   +"Total Bonus: " +totalBonus+ "\n"
						   +"Bonus Amount: "+bonusAmount+ "\n"
						   +"Total Salary: "+totalSalary);
		
	}
}

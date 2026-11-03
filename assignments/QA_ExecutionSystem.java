package com.futureskillit.assignments;

import java.util.Scanner;

public class QA_ExecutionSystem {

	public static void main(String[] args) {
		
		String environment="";
		String browser="";
		String testSuite="";
		int testCount =0;
			
		Scanner sc = new Scanner(System.in) ;
		
	/*	if(!environment.equals("QA") && !environment.equals("Dev") && !environment.equals("Stage")) {
			System.out.println("Invalid Execution Environment");
		}
	*/
		
		System.out.println("Select Environment:");
		System.out.println("1: QA");
		System.out.println("2: Dev");
		System.out.println("3: Stage");
		System.out.println("Enter the Execution Environment: ");
		int env_choice = sc.nextInt();
		
		switch(env_choice) {
			case 1: environment = "QA"; break;
			case 2: environment = "Dev"; break;
			case 3: environment = "Stage"; break;
			default: environment = "Invalid environment";
			
		}
		
		
		System.out.println("Select Browser:");
		System.out.println("1: chrome");
		System.out.println("2: firefox");
		System.out.println("3: edge");
		System.out.println("Enter the Browser Choice");
		int browserChoice = sc.nextInt();
		
		switch(browserChoice) {
		     case 1 :  browser = "chrome"; break;
		     case 2:   browser = "firefox"; break;
		     case 3:   browser = "edge"; break;
		     default: browser = "Invalid Browser";
		}
		
		System.out.println("Select Test Suite:");
		System.out.println("1: Smoke");
		System.out.println("2: Regression");
		System.out.println("3: Sanity");
		System.out.println("Enter the test suite choice");
		int testSuiteChoice = sc.nextInt();
		
		switch(testSuiteChoice) {
		case 1: testSuite = "Smoke";
					testCount = 20;
					break;
		case 2: testSuite = "Regression";
					testCount = 100;
					break;
		case 3: testSuite = "Sanity";
					testCount = 30;
					break;
		default: testSuite = "Invalid Test Suite";
		}
		System.out.println("Execution Summary.............");
		System.out.println("Environment: "+environment);
		System.out.println("Browser: "+browser);
		System.out.println("Test Suite: "+testSuite);
		System.out.println("Test Count: "+testCount);
		
		sc.close();
	}

}

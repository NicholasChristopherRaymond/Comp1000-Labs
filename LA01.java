package edu.wit.cs.comp1000;
import java.util.Scanner;
import java.lang.Math;

public class LA1a {

	public static void main(String[] args) {
		//make a new scanner
		Scanner scan = new Scanner(System.in);

		//use the scanner to take in the user's name and print out some statements associated with it. 
    /*	System.out.println("Hello! What is your name? ");
    	System.out.printf("Name: " );
    	String name = scan.nextLine();
    	System.out.println("Welcome " + name + "!");
   */
    	//use the scanner to get five integers form the user and save them to variables.
    	System.out.printf("Enter five numbers: ");
    	double num1 = scan.nextDouble();
    	double num2 = scan.nextDouble();
    	double num3 = scan.nextDouble();
    	double num4 = scan.nextDouble();
    	double num5 = scan.nextDouble();
    	
    	//find the sum and average of the numbers
    	double sum = num1 + num2 + num3 + num4 + num5;
    	double mean = sum/5;

    	//find the population standard deviation of the numbers
    	double popVar1 = num1 - mean;
    	double popVar2 = num2 - mean;
    	double popVar3 = num3 - mean;
    	double popVar4 = num4 - mean;
    	double popVar5 = num5 - mean;
    	double popStep2 = Math.pow(popVar1, 2) + Math.pow(popVar2, 2) + Math.pow(popVar3, 2) + Math.pow(popVar4, 2) + Math.pow(popVar5, 2);
    	double popStep3 = popStep2/5;
    	double finalVar = Math.sqrt(popStep3);
    	
    	//print out the things
    	System.out.printf("Sum: %.2f%n" , sum);
    	System.out.printf("Mean: %.2f%n" , mean);
    	System.out.printf("Population Standard Deviation: %.2f%n" , finalVar);
    	//System.out.println("Thank you for running LA1a, " + name + "! Goodbye.");
	}

}

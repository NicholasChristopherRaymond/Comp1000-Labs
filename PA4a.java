package edu.wit.cs.comp1000;
import java.util.Scanner;

//TODO: document this class
public class PA4a {

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the current price of the item: $");
        double price = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        System.out.print("Enter the inflation rate as a percentage: ");
        double inflation = scan.nextDouble();
        
        if(years < 0) {
        	System.out.printf("The number of years must be at least 0!%n");
        }
        else if(price < 0) {
        	System.out.printf("The current price must be at least 0!%n");
        }
        else if(inflation < 0) {
        	System.out.printf("The inflation rate must be at least 0!%n");
        }
        
        
        else {
        	
        	inflation = inflation / 100;
        
	        for(int i = 1; i <= years; i++) {
	            price = price * (1 + inflation);
	        }
        
	        if(years == 1) {
	        	System.out.printf("After " + years + " year, the price will be $%.2f" + "%n", price );
	        }
	        else {
	        	System.out.printf("After " + years + " years, the price will be $%.2f" + "%n", price );
	        }
        
        }
		
	}

}

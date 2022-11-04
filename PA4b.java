package edu.wit.cs.comp1000;
import java.util.Scanner;
import java.util.Random;

//TODO: document this class
public class PA4b {

	// TODO: document this method
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////////////////////
		// DO NOT CHANGE IN FINAL SUBMISSION
		//////////////////////////////////////////////////////////////////////////////
		
		Long seed;
		if (args.length != 1) {
			seed = null; // you can temporarily change this to assist in debugging
			             // the value must end in L, such as 1070L
		} else {
			seed = Long.valueOf(args[0]);
		}
		
		// Gets a random number between 1 and 100
		// Use the target variable as the correct answer for guessing
		Random random;
		if (seed == null) {
			random = new Random();
		} else {
			random = new Random(seed);
		}
		int target = (Math.abs(random.nextInt()) % 100) + 1;
		
		//////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////
		
		// It might be useful to see the correct answer
		// TODO: delete this line before attempting unit tests or submitting work
		//System.out.printf("%d%n", target);
		
		// TODO: write your code here	
		Scanner scan = new Scanner(System.in);
		int guess;
		do {
			System.out.print("Enter your guess (between 1 and 100): ");
			guess = scan.nextInt();
			if(guess > target && guess < 100) {
				System.out.printf("Too high!%n");
			}
			else if(guess < target && guess > 1) {
				System.out.printf("Too low!%n");
			}
			else if(guess == target){
				System.out.printf("You win!%n");
			}
			else {
				System.out.printf("Invalid guess, try again!%n");
			}
		} while(guess != target);
		
	}

}

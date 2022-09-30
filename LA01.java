package la01;
import java.util.Scanner;
import java.lang.Math;

public class LA01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello! What is your name? ");
        System.out.printf("Name: " );
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!");

        System.out.printf("Enter five Integers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        int mean = sum/5;

        double popVar1 = num1 - mean;
        double popVar2 = num2 - mean;
        double popVar3 = num3 - mean;
        double popVar4 = num4 - mean;
        double popVar5 = num5 - mean;

        double popStep2 = Math.pow(popVar1, 2) + Math.pow(popVar2, 2) + Math.pow(popVar3, 2) + Math.pow(popVar4, 2) + Math.pow(popVar5, 2);
        double popStep3 = popStep2/5;
        double finalVar = Math.sqrt(popStep3);

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Population Standard Deviation: " + finalVar);
        System.out.println("Thank you for running LA1a, " + name + "Goodbye.");
    }
}
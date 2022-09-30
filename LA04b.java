package la04;
import java.util.Scanner;
import java.lang.Math;

public class LA04b {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Choose an equation: \n1) Y=mx+b\n2) slope formula\n3) A= 4piR^2");
        int choice = scan.nextInt();

        if(choice == 1) {
            System.out.println("Enter the slope: ");
            int m = scan.nextInt();
            System.out.println("Enter the y-intercept: ");
            int b = scan.nextInt();
            System.out.println("Enter the value of x: ");
            int x = scan.nextInt();

            int y = (m * x) + b;
            System.out.println("F(x) = " + y);
        }
        else if (choice == 2) {
            System.out.println("Enter the first coordinate's x value: ");
            int x1 = scan.nextInt();
            System.out.println("Enter the first coordinate's y value: : ");
            int y1 = scan.nextInt();
            System.out.println("Enter the second coordinate's x value: ");
            int x2 = scan.nextInt();
            System.out.println("Enter the second coordinate's y value: : ");
            int y2 = scan.nextInt();

            int m  = (y2 - y1) / (x2 - x1);
            System.out.println("Slope is " +  m);
        }
        else if (choice == 3) {
            System.out.println("Enter the radius: ");
            int r = scan.nextInt();
            double a = 4 * 3.14 * Math.pow(r, 2);
            System.out.println("The area is: " + a);
        }
        else {
            System.out.println("You were supposed to enter a number between 1-3. You failed.");
        }

    }
}
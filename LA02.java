package la02;
import java.util.Scanner;
import java.lang.Math;

public class LA02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter the number of sides: ");
        int sides = scan.nextInt();
        System.out.printf("\nPlease enter the length of the sides: ");
        double length = scan.nextDouble();

        double area = (Math.pow(length, 2) * sides) / (4 * Math.tan(3.14/sides));

        double perimeter = sides * length;

        double inAngle = 180 - (360/sides);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Interior Angle: " + inAngle + " degrees");

    }
}
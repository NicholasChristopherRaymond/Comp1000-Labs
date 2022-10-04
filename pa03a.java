package PA03;
import java.util.Scanner;
import java.lang.Math;
public class pa03a {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean running = true;

        while(running = true) {
            System.out.println("Enter the length of side a: ");
            double a = scan.nextDouble();
            System.out.println("Enter the length of side b: ");
            double b = scan.nextDouble();
            System.out.println("Enter the length of side c: ");
            double c = scan.nextDouble();

            if (a + b > c || a + c > b || b + c > a) {
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("The area is " + area);
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}
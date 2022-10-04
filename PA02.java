package pa02;
import java.util.Scanner;
import java.lang.Math;
public class PA02 {

    public static double equation(int a, int b, int c) {
        double d = Math.pow(b, 2) - (4 * a * c );
        return d;
    }

    public static double round(double r) {
        int temp =(int) r * 100;
        r = temp / 100;
        return r;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter A, B, C:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(equation(a, b, c) < 0) {
            System.out.println("Roots: Imaginary");
        }
        else if (equation(a, b, c) == 0) {
            double r = -(b) / (2 * a);
            r = round(r);
            System.out.println("Root: " + r);
        }
        else {
            double r1 = ((b * -1) + Math.sqrt(equation(a, b, c))) / (2 * a);
            double r2 = ((b * -1) - Math.sqrt(equation(a, b, c))) / (2 * a);
            r1 = round(r1);
            r2 = round(r2);
            if(r1 > r2) {
                System.out.println("Roots: " + r2 + ", " + r1);
            }
            else {
                System.out.println("Roots: " + r1 + ", " + r2);
            }
        }
    }
}
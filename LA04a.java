package la04;
import java.util.Scanner;

public class LA04a {

    public static int GCD(int a, int b) {
        while(b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        return a;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();

        System.out.println("The GCD of " + a  + " and " + b + " is "  + GCD(a,b));
    }
}
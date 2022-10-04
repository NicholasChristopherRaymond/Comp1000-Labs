package pa03b;
import java.util.Scanner;

public class PA03B {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth month (1-12): ");
        int month = scan.nextInt();
        System.out.println("Enter your birth day (1-31): ");
        int day = scan.nextInt();

        if((month == 3 && day >= 21) || (month == 4 && day <= 19 )) {
            System.out.println("You are an Aries!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 4 || (month == 5 && day <= 20)) {
            System.out.println("You are a Taurus!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 5 || (month == 6 && day <= 21)) {
            System.out.println("You are a Gemini!");
            System.out.println("You have already fallen down the stairs.");
        }
        else if (month == 6 || (month == 7 && day <= 22)) {
            System.out.println("You are a Cancer!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 7 || (month == 8 && day <= 22)) {
            System.out.println("You are a Leo!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 8 || (month == 9 && day <= 22)) {
            System.out.println("You are a Virgo!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 9 || (month == 10 && day <= 22)) {
            System.out.println("You are a Libra!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 10 || (month == 11 && day <= 21)) {
            System.out.println("You are a Scorpio!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 11 || (month == 12 && day <= 21)) {
            System.out.println("You are a Sagittarius!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 12 || (month == 1 && day <= 19)) {
            System.out.println("You are a Capricorn!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 1 || (month == 2 && day <= 18)) {
            System.out.println("You are a Aquarius!");
            System.out.println("You will fall down the stairs.");
        }
        else if (month == 2 || month == 3 ) {
            System.out.println("You are a Pisces!");
            System.out.println("You will fall down the stairs.");
        }
        else {
            System.out.println("You will fall down the stairs twice since " +
                    "you are stupid enough to enter your own birthday wrong.");
        }

    }
}
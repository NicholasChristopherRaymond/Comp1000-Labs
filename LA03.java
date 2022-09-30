package la03;

import java.util.Scanner;
import java.lang.Math;

public class LA03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int[] array = new int[3];

        do {
            System.out.println("Enter three numbers: ");
            array[0] = scan.nextInt();
            array[1] = scan.nextInt();
            array[2] = scan.nextInt();

            System.out.println("Enter Operation: ");
            String word = input.nextLine();

            //min
            if (word.equals("min")) {
                int tempvar;
                for(int i = 0; i < array.length; i++) {

                    for(int j = i + 1; j < array.length; j++) {
                        if (array[i] > array[j]) {
                            tempvar = array[i];
                            array[i] = array[j];
                            array[j] = tempvar;
                        }
                    }
                }
                System.out.println("min(" + array[0] + ", " + array[1] + ", " + array[2] + ") = " + array[0]);
            }
            //l1
            else if(word.equals("l1")) {
                int num1 = Math.abs(array[0]);
                int num2 = Math.abs(array[1]);
                int num3 = Math.abs(array[2]);
                double sum = num1 + num2 + num3;
                System.out.println("l1(" + array[0] + ", " + array[1] + ", " + array[2] + ") = " + sum);
            }
            //l2
            else if(word.equals("l2")) {
                double num = Math.sqrt((Math.pow(array[0], 2) +  Math.pow(array[1], 2) + Math.pow(array[2], 2)));
                System.out.println("l2(" + array[0] + ", " + array[1] + ", " + array[2] + ") = " + num);
            }

            else if (word.equals("end")) {
                running = false;
                break;
            }

            else {
                System.out.println("Invalid operation!");
            }

        } while(running = true);

    }
}
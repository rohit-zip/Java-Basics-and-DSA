package Arrays;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        /**
         *
         * User will give us input
         * We have to check if even or odd
         */

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0){ // % Modulo Operator
            System.out.println("Given number is Even");
        } else {
            System.out.println("Odd Number");
        }
    }
}

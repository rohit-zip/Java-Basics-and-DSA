package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        /**
         *
         * a = 10;
         * b = 20;
         *
         * b = 10;
         * a = 20;
         */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a = 10
        int b = sc.nextInt(); // b = 20

        System.out.println("Before Swapping a = " + a + " b = " + b);
        int temp = a; // temp = 10, a = 10
        a = b; // b = 20, a = 20
        b = temp; // a = 20, b = 10, temp = 10
        System.out.println("After Swapping a = " + a + " b = " + b);
    }
}

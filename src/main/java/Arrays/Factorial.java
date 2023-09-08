package Arrays;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /**
         *
         * Input -> a = 6
         * Output -> 720
         *
         * 1 * 2 * 3 * 4 * 5 * 6
         * 2
         */

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 1;
        for (int i = 1 ; i<=number ; i++){
            result = result * i;
            // Loop 1 -> i=1, result=1, result=1
            // Loop 2 -> i=2, result=1, result=2
            // Loop 3 -> i=3, result=2, result=6
            // Loop 4 -> i=4, result=6, result=24
            // Loop 5 -> i=5, result=24, result=120
        }
        System.out.println(result);

        // 6! -> 5! * 6
    }
}

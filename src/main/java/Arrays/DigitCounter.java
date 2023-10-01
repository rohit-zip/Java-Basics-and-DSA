package Arrays;

import java.util.Scanner;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 29 September-2023
 */

public class DigitCounter {

    public static int digitCounter(int number, int digit){
        /**
         *
         * 756754645
         */

        int variable = 0;

        while(number>0){
            int lastDigit = number%10;
            number = number/10;

            if (lastDigit==digit){
                variable++;
            }
        }
        return variable;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();
        System.out.println(digitCounter(number, 5));
    }
}

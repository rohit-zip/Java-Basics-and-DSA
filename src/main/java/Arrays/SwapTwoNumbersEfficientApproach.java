package Arrays;

import java.util.Scanner;

public class SwapTwoNumbersEfficientApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a = 10
        int b = sc.nextInt(); // b = 20

        System.out.println("Before Swapping a = " + a + " b = " + b);

        a = a - b; // a = -10
        b = a + b; // -10 + 20 = 10 = b
        a = b - a; // a = 10 - (-10) = 20

        System.out.println("After Swapping a = " + a + " b = " + b);
    }
}

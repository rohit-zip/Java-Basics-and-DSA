package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 14 December-2023
 * Created_at - 20 : 38
 */

public class PrintNumbers {

    public static void printNumbers(int n) {
        // 1 2 3 4 5 6 7 ----- n
        if (n==0) return;
        printNumbers(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumbers(7);
    }
}

package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 14 December-2023
 * Created_at - 20 : 34
 */

public class ReversePrint {

    public static void printReverse(int n) {
        if (n==0) return;
        System.out.println("Filling In Stack : " + n);
        printReverse(n-1);
        System.out.println("Wiping from Stack : " + n);
    }

    public static void main(String[] args) {
        printReverse(5);
    }
}

package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 20 December-2023
 * Created_at - 18 : 17
 */

public class Factorial {

    public static int factorial(int data) {
        if (data==1) {
            return 1;
        }
        return data * factorial(data-1);
    }

    public static void main(String[] args) {
        int factorial = factorial(7);
        System.out.println(factorial);
    }
}

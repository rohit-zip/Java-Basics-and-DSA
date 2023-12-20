package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 20 December-2023
 * Created_at - 18 : 28
 */

public class Power {

    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * power(n, p-1);
    }

    public static void main(String[] args) {
        System.out.println(power(4, 4));
    }
}

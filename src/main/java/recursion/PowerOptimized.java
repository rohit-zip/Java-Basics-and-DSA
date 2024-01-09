package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 09 January-2024
 * Created_at - 21 : 30
 */

public class PowerOptimized {

    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        if (p%2==0) {
            return power(n, p/2) * power(n, p/2);
        } else {
            return power(n, p/2) * power(n, p/2) * n;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
}

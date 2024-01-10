package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 10 January-2024
 * Created_at - 21 : 23
 */

public class RecursionFlow {

    public static void flow(int n) {
        if (n==0) {
            return;
        }
        System.out.println("Pre Area : " + n);
        flow(n-1);
        System.out.println("In Area : " + n);
        flow(n-1);
        System.out.println("Post Area : " + n);
    }

    public static void main(String[] args) {
        flow(2);
    }
}

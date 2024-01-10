package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 10 January-2024
 * Created_at - 21 : 35
 */

public class TowerOfHanoi {

    public static void tower(int plates, int a, int b, int c) {
        if (plates == 0) {
            return;
        }
        tower(plates - 1, a, c, b);
        System.out.println(plates + " [ " + a + " -> " + b + " ] ");
        tower(plates - 1, c, b, a);
    }

    public static void main(String[] args) {
        tower(3, 10, 11, 12);
    }
}

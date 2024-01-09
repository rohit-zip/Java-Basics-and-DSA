package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 09 January-2024
 * Created_at - 21 : 25
 */

public class PrintReverse {

    public static void printReverse(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        printReverse(array, index + 1);
        System.out.println(array[index]);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        printReverse(array, 0);
    }
}

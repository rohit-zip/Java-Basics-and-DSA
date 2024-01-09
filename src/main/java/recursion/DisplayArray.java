package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 09 January-2024
 * Created_at - 21 : 13
 */

public class DisplayArray {

    public static void print(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        System.out.println(array[index]);
        print(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        print(array, 0);
    }
}

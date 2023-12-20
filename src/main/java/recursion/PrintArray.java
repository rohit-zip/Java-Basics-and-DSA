package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 20 December-2023
 * Created_at - 18 : 34
 */

public class PrintArray {

    public static void printArray(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        System.out.println(array[index]);
        printArray(array, index + 1);
        System.err.println(array[index]);
    }

    public static void main(String[] args) {
        printArray(new int[]{1,2,3,4,5,6,7,8}, 0);
    }
}

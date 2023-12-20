package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 20 December-2023
 * Created_at - 18 : 41
 */

public class MaxOfArray {

    public static int maxArray(int[] array, int index) {
        if (array.length-1 == index) {
            return array[array.length-1];
        }
        int i = maxArray(array, index + 1);
        if (i > array[index]) {
            return i;
        } else {
            return array[index];
        }
    }

    public static void main(String[] args) {
        System.out.println(maxArray(new int[]{1,2,3,4,5,16,7,8}, 0));
    }
}

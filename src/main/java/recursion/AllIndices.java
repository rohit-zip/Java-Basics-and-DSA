package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 09 January-2024
 * Created_at - 22 : 00
 */

public class AllIndices {

    public static int[] allIndices(int[] array, int data, int index, int founds) {
        if (index == array.length) {
            return new int[founds];
        }
        if (array[index] == data) {
            int[] iArray = allIndices(array, data, index + 1, founds + 1);
            iArray[founds] = index;
            return iArray;
        } else {
            int[] iArray = allIndices(array, data, index + 1, founds);
            return iArray;
        }
    }

    public static void main(String[] args) {
        int[] ints = allIndices(new int[]{1, 2, 7, 1, 2, 8, 2, 5, 1, 7, 2}, 2, 0, 0);
        for (int a : ints) {
            System.out.println(a);
        }
    }
}

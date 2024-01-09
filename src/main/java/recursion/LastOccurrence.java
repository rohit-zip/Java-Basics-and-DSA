package recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 09 January-2024
 * Created_at - 21 : 50
 */
public class LastOccurrence {

    public static int lastOccurrence(int[] array, int index, int data) {
        if (index == array.length) {
            return -1;
        }
        int i = lastOccurrence(array, index + 1, data);
        if (i==-1) {
            if (array[index] == data) {
                return index;
            } else {
                return -1;
            }
        } else {
            return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(lastOccurrence(new int[]{1, 2, 7, 1, 2, 8, 2, 5, 1, 7, 2}, 0, 2));
    }
}

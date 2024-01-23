package sorting;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - sorting
 * Created_on - 23 January-2024
 * Created_at - 20 : 17
 */

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i=1 ; i<=array.length - 1 ; i++) {
            for (int j=0 ; j<array.length - i ; j++) {
                if (array[j+1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 8, 4, 9, 1};
        bubbleSort(array);

        for (int a : array) {
            System.out.println(a);
        }
    }
}

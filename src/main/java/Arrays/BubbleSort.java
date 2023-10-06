package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 06 October-2023
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 7, 6, 8, 4, 0};
        for (int i=1 ; i<array.length ; i++){
            for (int j=0 ; j<array.length-i ; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i=0 ; i<array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
}

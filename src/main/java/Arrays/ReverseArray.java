package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 09 18-2023
 */

public class ReverseArray {

    public static int[] reverse(int[] array){
        int[] newArray = new int[array.length];
        int lastIndex = array.length - 1;
        for (int i=lastIndex ; i>=0 ; i--){
            newArray[lastIndex-i] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        /**
         *
         * array = {2, 10, 7, 1, 6}; // length : 5, lastIndex : length-1
         * reverse = {6, 1, 7, 10, 2}
         */
        int[] myArray = {2, 10, 7, 1, 6};
        int[] reversedArray = reverse(myArray);

        for (int i =0 ; i<reversedArray.length ; i++){
            System.out.println(reversedArray[i]);
        }
    }
}

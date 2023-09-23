package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 09 23-2023
 */

public class ArrayMinAndMax {

    public static int findMin(int[] intArray){
        int min = intArray[0];
        for (int i=1 ; i<intArray.length ; i++){
            if (intArray[i]<min){
                min = intArray[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {1,7,4,10,2,20,25,6,5};
        findMin(array);
//        findMax(array);

        /**
         *
         * Q1 -> Array {7, 10, 14, 25, 16, 2, 20, 6};
         * Output 25 and 29
         * Print element which is greater than it's neighbours
         *
         * Q2 -> array {5,7,7,7,7,1,1,4,4,6} target=7
         * Output -> 4
         * How many times 7 comes
         */
    }
}

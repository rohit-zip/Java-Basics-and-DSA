package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 09 15-2023
 */

public class TwoSum {

    public static int[] twoSum(int[] array, int target){
        for (int i=0 ; i<array.length ; i++){
            int value = array[i];
            for (int j=i+1 ; j<array.length ; j++){
                if (value + array[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] array = {1, 11, 7, 15, 16, 10, 25};
        int target = 27;

//        for (int i=1 ; i<array.length ; i++){
////            System.out.println(array[i] + array[i+1]); //ArrayIndexOutOfBoundsException
//            int sum = array[i-1] + array[i];
//            System.out.println(sum);
//        }

        int[] resultArray = twoSum(array, target);

        for (int i=0 ; i<resultArray.length ; i++){
            System.out.println(resultArray[i]);
        }
    }
}

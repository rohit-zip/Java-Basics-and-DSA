package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 09 15-2023
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 11, 7, 15};
        int target = 9;

        for (int i=1 ; i<array.length ; i++){
//            System.out.println(array[i] + array[i+1]); //ArrayIndexOutOfBoundsException
            int sum = array[i-1] + array[i];
            System.out.println(sum);
        }
    }
}

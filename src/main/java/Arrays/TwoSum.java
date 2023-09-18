package Arrays;

import com.sun.security.jgss.GSSUtil;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 09 15-2023
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] resultArray = new int[] {};
        for (int i=0 ; i<array.length ; i++){
            System.out.println(array[i]); //i=0
            for (int j=i+1 ; j<array.length ; j++){
                int sum = array[i] + array[j];
                if (sum==target) {
                    resultArray = new int[] {i, j};
                    break;
                }
            }
        }

        for (int i=0 ; i<resultArray.length ; i++){
            System.out.println(resultArray[i]);
        }
    }
}

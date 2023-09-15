package Arrays;

import java.util.Scanner;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 09 15-2023
 */

public class ArrayInput {
    public static void main(String[] args) {
//        int[] array = {2, 7, 11, 15};
//        int[] array = new int[4];
//        array[0] = 2; // array[0]
//        array[1] = 7;
//        array[2] = 11;
//        array[3] = 15; // array[array.length-1]
//
//        for (int i=0 ; i<array.length ; i++){
//            System.out.println(array[i]);
//        }

        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        for (int i=0 ; i<array.length ; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

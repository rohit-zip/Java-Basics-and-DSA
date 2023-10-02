package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 02 October-2023
 */

public class Tower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter values : ");
        for (int i=0 ; i<array.length ; i++){
            array[i] = scanner.nextInt();
        }
        // {2  4  5  1}
        int max = array[0];
        for (int i=0 ; i<array.length ; i++){
            if (array[i]>max){
                max = array[i];
            }
        }

        for (int i=max ; i>=1 ; i--){ //5 //4
            for (int j=0 ; j<array.length ; j++){
                if (array[j]>=i){
                    System.out.print("|\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

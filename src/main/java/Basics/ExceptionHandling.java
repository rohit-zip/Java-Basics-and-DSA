package Basics;

import java.util.Scanner;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 19 October-2023
 */
public class ExceptionHandling {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int numerator = sc.nextInt();
//
//        int denominator = sc.nextInt();
//
//        try {
//            int di = numerator/denominator;
//            System.out.println(di);
//        } catch (Exception exception) {
//            System.err.println(exception.getMessage());
//        }

        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 4, 5, 6 ,7};
        int index = sc.nextInt();
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println(exception.getMessage());
        }
    }
}

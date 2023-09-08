package Arrays;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        /**
         *
         * User will give us input in integer for table
         * User will give input for length of table
         * We have to print table for that
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table to be printed : ");
        int table = sc.nextInt();
        System.out.println();
        System.out.print("Enter length of the table : ");
        int length = sc.nextInt();

        for (int i=1 ; i<=length ; i++){
            // 7 X 1 = 7
            // 7 X 2 = 14
            // table X i = table*i
            System.out.println(table + " X " + i + " = " + table*i);
        }
    }
}

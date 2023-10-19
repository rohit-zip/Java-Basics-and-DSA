package Arrays;

import java.util.Scanner;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 10 October-2023
 */

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i=0 ; i<str.length() ; i++){
            for (int j=i ; j<str.length() ; j++){
                System.out.print(str.substring(i, j+1) + " ");
            }
            System.out.println();
        }
    }
}

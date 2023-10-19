package Arrays;

import java.util.Scanner;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 10 October-2023
 */

public class Output {

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i<=j){
            if (str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next(); // abdbabdadb

        for (int i=0 ; i<data.length() ; i++){
            for (int j=i ; j<data.length() ; j++){
                String substring = data.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > 1){
                    System.out.println(substring);
                }
            }
        }
    }
}

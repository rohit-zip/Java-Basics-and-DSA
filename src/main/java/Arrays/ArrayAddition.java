package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 01 October-2023
 */

public class ArrayAddition {

    public static void main(String[] args) {
        int[] a1 = {9, 4, 8, 5, 7};
        int[] a2 = {8, 4, 7, 5};
        int[] array = new int[Math.max(a1.length, a2.length)];
        int a = a1.length-1;
        int b = a2.length-1;
        int i = array.length-1;
        int carry = 0;
        while(i>=0){
            int d = carry;
            if (a>=0){
                d = d + a1[a]; //7 //6
            }
            if (b>=0){
                d = d + a2[b]; //12 //12
            }
            carry = d/10;
            d = d%10;
            array[i] = d;
            a--;
            b--;
            i--;
        }
        if (carry!=0){
            System.out.print(carry + " ");
        }
        for (int value : array){
            System.out.print(value + " ");
        }
    }
}

package Arrays;

import java.util.Scanner;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 03 October-2023
 */

public class FloorCeil {
    public static void main(String[] args) {
        int[] array = {20, 40, 50, 60, 70, 80, 100, 110};
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int low = 0;
        int high = array.length-1;
        int floor = 0;
        int ceil = 0;
        while(low<=high){
            int mid = (low + high) / 2;
            if (array[mid] > data){
                high = mid - 1;
                ceil = array[mid];
            } else if (array[mid] < data){
                low = mid + 1;
                floor = array[mid];
            } else {
                ceil = array[mid];
                floor = array[mid];
                break;
            }
        }
        System.out.println("Floor : " + floor);
        System.out.println("Ceil : " + ceil);
    }
}

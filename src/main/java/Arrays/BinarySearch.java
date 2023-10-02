package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 02 October-2023
 */

public class BinarySearch {

    /**
     *
     * {2,6,8,14,16}
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 10, 16, 20, 25, 28, 40, 60, 70, 80, 100, 110};
        int low = 0;
        int data = 100;
        int high = array.length-1;
        while(low<=high){
            int mid = (low + high) / 2;
            if (array[mid] > data){
                high = mid - 1;
            } else if (array[mid] < data){
                low = mid + 1;
            } else {
                System.out.println(mid);
                return;
            }
        }
    }
}

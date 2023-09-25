package Arrays;

public class LinearSearch {

    public static int linearSearch(int[] array, int number){
        for (int i=0 ; i<array.length ; i++){
            if (array[i]==number){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /**
         *
         * Searching in a array linearly
         * [1,2,4,5,6,7,8]
         */

        int[] array = {1,2,4,5,6,7};
        System.out.println(linearSearch(array, 6));
    }
}

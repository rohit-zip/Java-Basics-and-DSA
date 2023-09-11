package Basics;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
                     //0  1  2  3  4

        String[] strings = {"rohit", "atharva", "rakesh", "mukesh"};

        /**
         *
         * int a = array[1]
         */
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]); ArrayOutOfBoundException
//        System.out.println(array.length);
        for (int i=0 ; i<array.length ; i++){
            System.out.println(array[i]);
        }

        //While Loop

        for (int i=0 ; i<strings.length ; i++){
            System.out.println(strings[i]);
        }
    }
}

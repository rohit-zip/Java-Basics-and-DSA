package Basics;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 7, 6, 2, 10, 16, 2, 25};
                     //0  1  2  3  4

        int[] newArray = new int[10];
        newArray[0] = 11;
        newArray[1] = 2;
        newArray[2] = 7;
        newArray[3] = 16;

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
//        System.out.println(array[5]); ArrayIndexOutOfBoundException
//        System.out.println(array.length);
        for (int i=0 ; i<array.length ; i++){
            System.out.println(array[i]);
        }

        for (int i=array.length - 1 ; i>=0 ; i--){
            System.out.println(array[i]);
        }

        //While Loop

        for (int i=0 ; i<strings.length ; i++){
            System.out.println(strings[i]);
        }

        for (int i = 0 ; i<array.length ; i++){
            if (array[i]==2){
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0 ; i<array.length ; i++){
            if (array[i]==2){
                System.out.println(i);
            }
        }
    }
}

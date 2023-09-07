package Basics;

public class IfElse {
    public static void main(String[] args){
        /**
         *
         * if(condition){
         *
         * } else {
         *
         * }
         */

        int age = 15;
//        if (age>18){
//            System.out.println("You are eligible for Driving");
//        } else {
//            System.out.println("You are not eligible");
//        }

//        if (age>18 && age<=21){
//            System.out.println("Females are eligible for Marriage");
//        } else if (age>21){
//            System.out.println("Both Males and Females are eligible for Marriage");
//        } else if (age<=18){
//            System.out.println("Not eligible for Marriage");
//        }

        if (age<18 && age>65){
            System.out.println("In or block");
        }

        /**
         *
         * && Both condition must be true
         * || Any one condition can be true
         */
    }
}

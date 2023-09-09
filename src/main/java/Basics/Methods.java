package Basics;

import java.util.Scanner;

public class Methods {

    /**
     *
     * public :- Access Modifier, Accessible from everywhere
     * static :- No need to create Object
     * void :- No return type
     */
    public static void newMethod(){
        System.out.println("My name is Rohit");
    }

    public static void methodTwo(){
        System.out.println("Method Two");
    }

    /**
     *
     * Methods can return any Object
     *
     */
    public static int intMethod(){
        int sum = 10 + 60;
        //return 10 + 60;
        return sum;
    }

    public static String myName(){
        return "Rohit";
    }

    public static void main(String[] args){
//        Methods me = new Methods(); //Object Creation
//        me.newMethod();
        //newMethod();
        int a = intMethod();
        System.out.println(a);

        String name = myName();
        System.out.println(name);
        System.out.println(myName());
    }
}

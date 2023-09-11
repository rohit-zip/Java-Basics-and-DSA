package Basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Creating scanner object
//        int age = sc.nextInt();
//        System.out.println("Your age : " + age);
//
//        if (age>18){
//            System.out.println("You are eligible for Driving");
//        } else {
//            System.out.println("Not eligible driving Licence");
//        }

//        String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name : " + name);

    }
}

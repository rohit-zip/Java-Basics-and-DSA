package Basics;

import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = mathMethod(a, b);
        System.out.println(result);
    }

    public static String mathMethod(int a, int b){
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
//        String str = "Addition : " + addition + " || Subtraction : " + subtraction + " || Multiplication : " + multiplication + " || Division : " + division;
        String str = "Addition : " + addition + " \n" + "Subtraction : " + subtraction + "\n";
        return str;
    }
}

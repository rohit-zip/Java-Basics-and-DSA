package Basics;

public class MethodOverloading {

    public static int overloading(int a, int b){
        return a + b;
    }

    public static double overloading(double a, double b){
        return a + b;
    }

    public static int overloading(String a){
        System.out.println("In Third");
        int i = Integer.parseInt(a);
        return i;
    }

    public static void main(String[] args) {
        int s = overloading(10, 20);
        System.out.println(s);
        int overloading = overloading("10");
        System.out.println(overloading);
    }


    //Addition
    //Multiplication
    //Subtraction
    //Division
    //Create ATM using switch case
    //Return type must be String. Input 2 parameters for all outputs addition, subtraction, multiplication, division
}

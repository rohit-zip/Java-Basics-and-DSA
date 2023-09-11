package Basics;

public class MethodParameters {

    public static int addition(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static String stringMethod(int a, String name, char b, boolean bool){
        return name;
    }

    public static void main(String[] args){
        int a = addition(10 ,60);
        System.out.println(a);
        System.out.println(addition(2, 5));
        stringMethod(10, "Rohit", 'a', true);
    }
}

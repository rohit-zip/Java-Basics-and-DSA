package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 20 October-2023
 */

class Dummy<A> {

    /**
     * Generics only takes object not primitive data type
     */

    A object;

    Dummy(A object){
        this.object = object;
    }

    public A getObject() {
        return this.object;
    }
}

public class Generics {

    public static<T> void print(T data) {
        System.out.println(data.getClass().getName() + " = " + data);
    }

    public static void main(String[] args) {
//        Dummy<Integer> integerDummy = new Dummy<>(10);
//        System.out.println(integerDummy.getObject());
//
//        Dummy<String> stringDummy = new Dummy<>("Rohit");
//        System.out.println(stringDummy.getObject());

        print(25);
        print("Rohit Parihar");
    }
}

/**
 *
 * Wrapper Class -> It's a way to declare primitive data types in the form of Objects
 * int -> Integer
 * long -> Long
 * char -> Character
 * double -> Double
 * boolean -> Boolean
 * float -> Float
 */
package Basics.OOPS;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics.OOPS
 * @created_on - 09 14-2023
 */

public class JavaClasses {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.firstName);

//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        System.out.println(innerClass.lastName);
    }
}

class OuterClass {
    String firstName = "Rohit";
    // Variables, Objects, Methods, Constructors, Classes

    static class InnerClass {
        String lastName = "Parihar";
    }
}


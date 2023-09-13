package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 09 13-2023
 */

public class JavaObjects {

    int a = 10; //class attributes

//    final int a = 10; //cannot change the value after declaring

    public static void main(String[] args) {
        JavaObjects jb = new JavaObjects();
        JavaObjects ab = new JavaObjects();

        jb.a = 20;
        System.out.println(jb.a);

        AccessModifiers am = new AccessModifiers();
        // am.number; //cannot access as it is private
//        System.out.println(am.number);
//
//        Encapsulation encapsulation = new Encapsulation();
//        System.out.println(encapsulation.number);
//        System.out.println(Encapsulation.a);
    }
}

package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 09 13-2023
 */

/**
 *
 * OOPS -> Object Oriented Programming
 *
 * DRY -> Don't repeat yourself
 * We can make fully reusable code
 *
 * Class -> Programming Languages
 * Objects -> Java, C++, etc
 *
 * public class <Classname> {
 *     // Body
 * }
 *
 * Encapsulation -> Hide sensitive data from user
 * Polymorphism -> Many forms of one object
 * Inheritance -> Inherit attributes from parent class
 * Abstraction -> Only showing essential data to users (abstract class and interfaces)
 *
 */
 public class OOPSConcept {

     int a = 20;

    public static void main(String[] args) {
        OOPSConcept op = new OOPSConcept(); //Object creation
        System.out.println(op.a);
        op.sum(10);
    }

    public int sum(int b) {
        return b + a;
    }

}

package Basics;

import com.sun.security.jgss.GSSUtil;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 09 13-2023
 */

public class EncapsulationMethods {

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Rohit Parihar");
        encapsulation.setAge(25);

        String name = encapsulation.getName();
        int age = encapsulation.getAge();

        System.out.println(name);
        System.out.println(age);
    }
}

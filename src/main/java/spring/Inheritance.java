package spring;

import Basics.Variables;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - spring
 * Created_on - 23 November-2023
 * Created_at - 21 : 52
 */

public class Inheritance extends Variables {

    double pi = 3.14;
    Integer name;

    public void myMethod(Integer name) {
        this.name = name;
        System.out.println(this.name);
    }
}
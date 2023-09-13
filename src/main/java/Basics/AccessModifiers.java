package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 09 13-2023
 */

public class AccessModifiers {

    private int number = 20;

    int openNumber = 10;

    /**
     * Access Modifiers
     *
     * Class Level Access Modifiers
     *      1.) public -> Can be accessible from other classes
     *      2.) default -> Only accessible by same package
     *
     * Access Modifiers for Attributes, Mehtods and Constructors
     *      1.) public -> Can be accessible from other classes even outside package
     *      2.) default -> Only accessible by same package
     *      3.) private -> Accessible only in same class
     *      4.) protected -> same package and subclasses
     */

    /**
     *
     * Non Access Modifiers
     *
     * Class Level Non Access Modifiers
     *      1.) final -> Cannot be inherited by other classes
     *      2.) abstract -> We cannot create object of it (To access we must inherit it from another class)
     *
     * Non Access Modifiers for Attributes, Mehtods and Constructors
     *      1.) final -> We cannot be overridden
     *      2.) static -> Only accessible by same package
     *      3.) private -> Accessible only in same class
     *      4.) protected -> same package and subclasses
     */
}

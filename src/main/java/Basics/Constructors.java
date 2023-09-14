package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 09 14-2023
 */

public class Constructors {

    /**
     *
     * It is a special method which can be used to initialize objects
     */

    final int x;

    Constructors(){
        x = 20;
    }

    public static void main(String[] args) {
        Constructors ab = new Constructors();
        System.out.println(ab.x);
    }
}

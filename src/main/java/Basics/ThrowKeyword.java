package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 19 October-2023
 */
public class ThrowKeyword {

    public static void checkName(String name) {
        if (name.length() > 20) {
            throw new RuntimeException("Name length cannot be greater than 20 Characters");
        } else if (name.length() <= 2) {
            throw new RuntimeException("Name length should be greater than 2 characters");
        }
    }

    public static void main(String[] args) {
        checkName("ab");
        System.out.println("Application Completed");
    }
}

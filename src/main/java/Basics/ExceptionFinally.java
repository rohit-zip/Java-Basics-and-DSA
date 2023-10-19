package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 19 October-2023
 */

public class ExceptionFinally {
    public static void main(String[] args) {

        try {
            int[] array = {1, 2, 4, 5, 6, 7};
            System.out.println(array[1]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Finally Occurred");
        }
    }
}

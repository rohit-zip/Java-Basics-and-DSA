package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 09 14-2023
 */

public class ParametrisedConstructors {

    private String name;
    private String city;

    public ParametrisedConstructors(String name, String city){
        this.name = name;
        this.city = city;
    }

    ParametrisedConstructors(String name){
        this.name = name;
    }

    public ParametrisedConstructors(){}

    public static void main(String[] args) {
        ParametrisedConstructors pc = new ParametrisedConstructors("Rohit", "Pune");
        System.out.println(pc.name);

        ParametrisedConstructors ab = new ParametrisedConstructors();

    }
}

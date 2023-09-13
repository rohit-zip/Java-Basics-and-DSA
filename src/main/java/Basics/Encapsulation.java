package Basics;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 09 13-2023
 */

public class Encapsulation {

//    int number = 10;
//    static int a = 20;

    /**
     *
     * We can achieve it using
     *      private and get, set Methods
     */

    private String name;
    private int age;


    //Getter and Setters

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}

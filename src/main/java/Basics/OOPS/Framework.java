package Basics.OOPS;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics.OOPS
 * @created_on - 09 15-2023
 */

//We cannot create object of it
abstract class SpringBoot {

    public abstract void springBootLanguage(); //Abstract Method cannot have body

    public void springBootFramework(){ //Normal Method
        System.out.println("Spring Boot Framework");
    }
}

class JavaLanguage extends SpringBoot {
    public void springBootLanguage(){
        System.out.println("Implemented with java programming language");
    }
}

class KotlinLanguage extends SpringBoot {

    @Override
    public void springBootLanguage() {
        System.out.println("Implemented with kotlin programming language");
    }
}

public class Framework {
    public static void main(String[] args) {
        JavaLanguage javaLanguage = new JavaLanguage();
        javaLanguage.springBootLanguage();
        javaLanguage.springBootFramework();

        KotlinLanguage kotlinLanguage = new KotlinLanguage();
        kotlinLanguage.springBootLanguage();
        kotlinLanguage.springBootFramework();
    }
}

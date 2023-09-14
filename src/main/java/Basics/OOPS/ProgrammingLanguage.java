package Basics.OOPS;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics.OOPS
 * @created_on - 09 14-2023
 */

public class ProgrammingLanguage {

    String languageName;

    public void programmingLanguage(){
        System.out.println("Programming Language : " + languageName);
    }
}

class Java extends ProgrammingLanguage {

//    public void programmingLanguage(){
//        System.out.println("Java Programming Language : " + languageName);
//    }


    public void javaMethod(){
        System.out.println("Java Method");
        Java java = new Java();
        java.languageName = "Java";
        java.programmingLanguage();
    }
}

final class Dart extends ProgrammingLanguage {
    public void dartMehtod(){
        System.out.println("Dart Method");
        Dart dart = new Dart();
        dart.languageName = "Dart";
        dart.programmingLanguage();
    }
}

class MainMethod {
    public static void main(String[] args) {
        Java java = new Java();
        Dart dart = new Dart();
        java.javaMethod();
        dart.dartMehtod();
    }
}
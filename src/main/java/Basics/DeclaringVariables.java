package Basics;

public class DeclaringVariables {
    public static void main(String[] agrs){
        int a = 10;
        int b = 60;
//        System.out.println(b/a);

        int d = a + b;
        int e = b - a;
        int f = a * b;
        int g = b / a;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

//        float x = 10.25f;
        float h = (float)a / b; //Type Casting
        System.out.println(h);

        int x = 10, y = 20, z = 50;
        System.out.println((float)(x + y)/z);

        /**
         *
         * Name must starts/begins with letter
         * Name cannot contains space
         * Name can begin with _ or $
         * We can use numbers, _ or $ in name
         * We can't use reserved words of Java (class, public, System, new,etc)
         *
         * Identifiers are case sensitive
         * schoolName != SchoolName
         * school_name
         * schoolName, firstName
         * SchoolName, FirstName
         */
    }
}

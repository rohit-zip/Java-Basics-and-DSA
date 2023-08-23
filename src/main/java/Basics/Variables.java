package Basics;

public class Variables {
    public static void main(String[] args){
        //How to declare variables
        // type <variableName> = value;

        /*
            String -> It will store text, words, etc.
		  (Must be surrounded by Double Quotes "Rohit")
         */
        String name = "Rohit"; //Variable
        String college = "Chandigarh University";
        System.out.println(name);
        System.out.println(college);

        /*
                int -> Will store integers or numbers (Not decimal)
		        (It will store 10 but not 10.15)
         */
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        /*
                float -> Store decimal numbers (10.15, 10.20, etc)
                We need to write f at the end of value
         */
        float ab = 10.25f;
        System.out.println(ab);

        /*
                boolean -> true and false
         */
        boolean ba = false;
        System.out.println(ba);
    }
}

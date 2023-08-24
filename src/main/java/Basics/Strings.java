package Basics;

public class Strings {
    public static void main(String[] args){
        String name = "Rohit";
        System.out.println(name);

        String uCase = name.toUpperCase();
        System.out.println(uCase);

        String lCase = name.toLowerCase();
        System.out.println(lCase);

        int len = name.length();
        System.out.println(len);

        char ch = name.charAt(0);
        System.out.println(ch);

        String str = "     rohit parihar    ";
        System.out.println(str.trim());

        int o = name.indexOf('o');
        System.out.println(o);

        int oh = name.indexOf("ht");
        System.out.println(oh);

        String newStr = "abgfgabgh";
        System.out.println(newStr.indexOf("abc"));
        System.out.println(newStr.lastIndexOf("ab"));
        System.out.println(newStr.lastIndexOf('g'));
        System.out.println(newStr.indexOf('g'));
        System.out.println(newStr.replace('b', ' '));
        System.out.println(newStr.substring(5));
        System.out.println(newStr.substring(2, 6));
    }
}

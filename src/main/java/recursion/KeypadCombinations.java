package recursion;

import java.util.ArrayList;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 10 January-2024
 * Created_at - 22 : 03
 */

public class KeypadCombinations {

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getCombinations(String data) {
        if (data.length() == 0) {
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        char c = data.charAt(0);//2
        String substring = data.substring(1); //57
        ArrayList<String> combinations = getCombinations(substring); //mt, mu, nt, nu, ot, ou
        ArrayList<String> re = new ArrayList<>();
        String code = codes[c - '0'];
        for (int i=0 ; i<code.length() ; i++) {
            char c1 = code.charAt(i);//d, e, f
            for (String a : combinations) {
                re.add(c1 + a);
            }
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(getCombinations("257"));
    }
}

package recursion;

import java.util.ArrayList;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 13 January-2024
 * Created_at - 21 : 20
 */

public class StairsPath {

    public static ArrayList<String> getPaths(int n) {

        if (n == 0) {
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar; // 1
        } else if (n < 0) {
            ArrayList<String> ar = new ArrayList<>();
            return ar; // 0
        }
        ArrayList<String> paths1 = getPaths(n - 1);
        ArrayList<String> paths2 = getPaths(n - 2);
        ArrayList<String> paths3 = getPaths(n - 3);
        ArrayList<String> list = new ArrayList<>();

        for (String path : paths1) {
            list.add(1 + path);
        }

        for (String path : paths2) {
            list.add(2 + path);
        }

        for (String path : paths3) {
            list.add(3 + path);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getPaths(4));
    }
}

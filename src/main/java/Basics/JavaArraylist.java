package Basics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 20 October-2023
 */

public class JavaArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); //0
        arrayList.add(2); //1
        arrayList.add(4); //2
        arrayList.add(5); //3
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));
        arrayList.remove(3);

        System.out.println(arrayList);
        arrayList.add(5);

        arrayList.set(0, 7); // Index on Left side, Element on Right side

        System.out.println(arrayList);

        System.out.println(arrayList.size());

        for (int i=0 ; i<arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        Collections.sort(arrayList);

        for (Integer a : arrayList) {
            System.out.println(a);
        }
    }
}

package Basics;

import java.util.LinkedList;
import java.util.List;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 21 October-2023
 */
public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        /**
         *
         * addLast,
         * addFirst,
         * removeFirst,
         * removeLast,
         * getFirst,
         * getLast
         *
         * Access or storing the data -> Arraylist
         * Manipulating the data -> LinkedList
         *
         * Arraylist -> I has regular array implementation inside it. Whenever we added something, it's size expands automatically
         *              [ _ , _ , _ , _ , _ ] -> [ _ , _ , _ , _ , _ , _ , _ , _ , _ , _ ]
         *
         * LinkedList -> It Stores items in Nodes. And every node has address of the next one
         */
        list.add(10);
        list.add(20);
        list.addLast(40);
        list.addFirst(50);
        System.out.println(list);
    }
}

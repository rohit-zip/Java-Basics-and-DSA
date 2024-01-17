package generictree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - generictree
 * Created_on - 15 January-2024
 * Created_at - 21 : 49
 */

public class GenericTree {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root;
        Stack<Node> st = new Stack<>();

        for (int i=0 ; i<array.length ; i++) {
            if (array[i] == -1) {
                st.pop();
            } else {
                Node node = new Node();
                node.data = array[i];
                if (st.size() > 0) {
                    st.peek().children.add(node);
                } else {
                    root = node;
                }
                st.push(node);
            }
        }
    }
}

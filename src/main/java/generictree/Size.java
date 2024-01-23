package generictree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - generictree
 * Created_on - 23 January-2024
 * Created_at - 20 : 40
 */

public class Size {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static int size(Node root) {
        int s = 0;
        for (Node child : root.children) {
            int childSize = size(child);
            s += childSize;
        }
        s = s + 1;
        return s;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Stack<Node> st = new Stack<>();
        Node root = null;
        for (int a : array) {
            if (a == -1) {
                st.pop();
            } else {
                Node node = new Node();
                node.data = a;
                if (st.size() > 0) {
                    st.peek().children.add(node);
                } else {
                    root = node;
                }
                st.push(node);
            }
        }
        System.out.println(size(root));
    }
}

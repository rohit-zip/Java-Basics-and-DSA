package stacks;

import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - stacks
 * Created_on - 10 December-2023
 * Created_at - 20 : 28
 */

public class BalancedBrackets {

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String a = "[(1+2)+{(4+5)*(6/7)]}";

        for (int i=0 ; i<a.length() ; i++) {
            char ch = a.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    System.out.println(false);
                    return;
                } else if (st.peek() != '(') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (ch == '}') {
                if (st.isEmpty()) {
                    System.out.println(false);
                    return;
                } else if (st.peek() != '{') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (ch == ']') {
                if (st.isEmpty()) {
                    System.out.println(false);
                    return;
                } else if (st.peek() != '[') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}

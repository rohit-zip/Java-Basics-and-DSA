package stacks;

import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - stacks
 * Created_on - 05 December-2023
 * Created_at - 19 : 40
 */

public class DuplicateBracket {
    public static void main(String[] args) {
        String data = "((1+2)+(4+5))"; //True
        Stack<Character> st = new Stack<>();
        for (int i=0 ; i<data.length() ; i++) {
            char ch = data.charAt(i);
            if (ch == ')') {
                if (st.peek()=='(') {
                    System.out.println(true); //Duplicates Found
                    return;
                } else {
                    while(st.peek()!='(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}

package stacks;

import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - stacks
 * Created_on - 05 December-2023
 * Created_at - 19 : 22
 */

public class StackImplementation {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        Integer pop = st.pop();
        System.out.println(pop);
        System.out.println(st.peek());
    }
}

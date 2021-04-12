package problems_on_stack;

import java.util.Stack;

public class problem1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(32);
        st.push(62);
        st.push(82);
        int number = st.pop();
        System.out.println(number);
        System.out.println(st.peek());
        System.out.println(st.search(32));
    }
}

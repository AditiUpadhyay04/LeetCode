package Stack;

import java.util.Stack;

public class first {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(16);
        st.push(28);

        st.push(8);
        st.push(15);
        st.push(19);
        System.out.println("at peek" +st.peek());
        st.pop();
        System.out.println("pop this " + st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}

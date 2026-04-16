package Stack;

import java.util.Stack;

public class Make_The_String_Great {
        public String makeGood(String s) {
            Stack<Character> st = new Stack<>();

            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }

            StringBuilder res = new StringBuilder();

            while(!st.isEmpty()) {
                res.append(st.pop());
            }

            return res.reverse().toString();
        }

    public static void main(String[] args) {

    }
}


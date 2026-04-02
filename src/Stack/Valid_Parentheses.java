package Stack;

import java.util.Stack;

public class Valid_Parentheses {
        public boolean isValid(String s) {
            int n = s.length();
            Stack<Character> st = new Stack<>();


            for(int i = 0; i < n; i++){
                char ch = s.charAt(i);

                if(ch == '[' || ch == '{' || ch == '('){
                    st.push(ch);
                }
                else{
                    if(st.isEmpty()) return false;

                    if(ch == ')' && st.peek() != '(') return false;
                    if(ch == '}' && st.peek() != '{') return false;
                    if(ch == ']' && st.peek() != '[') return false;

                    st.pop();
                }
            }
            return st.isEmpty();

        }

    public static void main(String[] args) {

    }
}

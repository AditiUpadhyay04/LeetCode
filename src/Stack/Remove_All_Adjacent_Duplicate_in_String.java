package Stack;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicate_in_String {
        public String removeDuplicates(String s) {
            Stack<Character> st = new Stack<>();

            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);

                if(!st.isEmpty() && st.peek() == ch){
                    st.pop();

                }
                else{
                    st.push(ch);
                }
            }
            StringBuilder sb = new StringBuilder();

            while(!st.isEmpty()){
                sb.append(st.pop());
            }

            return sb.reverse().toString();
        }

    public static void main(String[] args) {

    }
}


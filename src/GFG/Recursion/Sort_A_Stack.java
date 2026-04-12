package GFG.Recursion;

import java.util.Stack;

public class Sort_A_Stack {

        public void insert(Stack<Integer> st , int temp){
            if(st.isEmpty() || st.peek() <= temp){
                st.push(temp);
                return;
            }
            int val = st.pop();
            insert(st,temp);
            st.push(val);

        }

        public void sortStack(Stack<Integer> st) {
            // code here
            if(st.size() == 1) return;
            int temp = st.pop();
            sortStack(st);
            insert(st, temp);

        }

    public static void main(String[] args) {

    }
}

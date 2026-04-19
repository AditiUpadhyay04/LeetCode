package GFG.Recursion;

import java.util.Stack;

public class Delete_Mid_Of_Stack {

        public void delete(Stack<Integer> s , int k){
            if(k == 1){
                s.pop();
                return;
            }
            int temp = s.pop();
            delete(s , k - 1);
            s.push(temp);
        }
        // Function to delete middle element of a stack.
        public void deleteMid(Stack<Integer> s) {
            int n = s.size();
            int k = n/2 + 1;
            delete(s , k);

        }
    }


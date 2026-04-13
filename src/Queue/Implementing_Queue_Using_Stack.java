package Queue;

import java.util.Stack;

public class Implementing_Queue_Using_Stack {
        Stack<Integer> s1 ;
        Stack <Integer> s2;

        public Implementing_Queue_Using_Stack() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            while(!s1.empty()){
                s2.push(s1.pop());

            }
            s1.push(x);
            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }

        public int pop() {
            if(s1.empty()){
                return -1;
            }
            else{
                return s1.pop();
            }
        }
        public int peek() {
            return s1.peek();

        }

        public boolean empty() {
            return s1.empty();

        }

    public static void main(String[] args) {

    }
}

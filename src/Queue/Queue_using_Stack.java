package Queue;

import java.util.Stack;
public class Queue_using_Stack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    boolean isEmpty(){
        return s1.isEmpty();
    }
    void push(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    int pop(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            return s1.pop();
        }
    }
    int peek(){
        return s1.peek();
    }
    void print(){
        while(!s1.isEmpty()){
            System.out.println(s1.pop() + " ");
        }
    }
    int size(){
        return s1.size();
    }

    public static void main(String[] args) {
        Queue_using_Stack q3 = new Queue_using_Stack();
        q3.push(5);
        q3.push(42);
        q3.push(4);
        q3.push(32);
        q3.push(516);
        System.out.println( "Popped element is : " + q3.pop());

        System.out.println( "Top element is : " + q3.peek());
        System.out.println("Size of queue is : " + q3.size());
        q3.print();
    }
}

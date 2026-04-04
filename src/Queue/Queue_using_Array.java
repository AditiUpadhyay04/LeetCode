package Queue;

import java.util.Queue;

public class Queue_using_Array {
    int size = 15;
    int[] queue = new int[size];
    int currSize = 0;
    int start = -1;
    int end = -1;

    boolean isFull(){
        return currSize == size;
    }
    boolean isEmpty(){
        return start == -1;
    }
    void push(int x)
    {
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            if(start == -1) start++;
            end = (end + 1) % size;
            queue[end] = x;
            currSize++;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int element = queue[start];
            start = (start + 1) % size;
            currSize--;
            if(currSize == 0){
                start = -1;
            }
            return element;
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            return queue[start];
        }
    }
    int size(){
        return currSize;
    }
    void print(){
        for(int i = 0; i < currSize; i++){
            System.out.println(queue[start] + " ");
            start = (start + 1) % size;
        }
    }

    public static void main(String[] args) {
        Queue_using_Array q1 = new Queue_using_Array();
        q1.push(16);
        q1.push(32);
        q1.push(525);
        q1.push(85);
        q1.push(64);
        q1.push(74);
        System.out.println( "Popped element is : " + q1.pop());

        System.out.println( "Top element is : " + q1.peek());
        System.out.println("Size of queue is : " + q1.size());

        q1.print();
    }
}

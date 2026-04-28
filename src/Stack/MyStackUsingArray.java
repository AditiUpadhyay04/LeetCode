package Stack;

public class MyStackUsingArray {
    int[] arr;
    int capacity;
    int top;

    MyStackUsingArray(int n){
        arr = new int[n];
        capacity = n;
        top = -1;
    }
    void push(int x){
        if(top == capacity - 1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top] = x;
        }
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(arr[top]);
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            top--;
        }
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else {
           return false;
        }
    }

    public static void main(String[] args) {
        MyStackUsingArray s1 = new MyStackUsingArray(4);
        System.out.println(s1.isEmpty());
        s1.pop();
        s1.push(12);
        s1.peek();
        s1.push(16);
        s1.peek();
        s1.push(18);
        s1.peek();
        s1.push(22);
        System.out.println(s1.isEmpty());
        s1.push(4);
    }

}

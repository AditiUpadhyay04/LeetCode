package Stack;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
public class StackUsingLinkedList {
    Node top;
    int size;

    StackUsingLinkedList(){
        top = null;
    }
    void push(int x){
        Node n = new Node(x);
        n.next = top;
        top = n;
    }
    void peek(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data);
        }
    }
    void pop(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
           top = top.next;
        }
        size --;
    }
    int size(){
        return size;
    }
    boolean empty(){
        return top == null;
    }

    public static void main(String[] args) {
        StackUsingLinkedList s1 = new StackUsingLinkedList();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pop();
        s1.peek();
        System.out.println(s1.size);
    }


}

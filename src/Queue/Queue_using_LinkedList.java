package Queue;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

 public class Queue_using_LinkedList {
    Node start = null;
    Node end = null;
    int size = 0;
    boolean isEmpty(){

        return start == null;
    }
    void push(int x) {
        Node temp = new Node(x);
        if (start == null) {
            start = temp;
            end = temp;
        } else {
            end.next = temp;
            end = temp;
        }
        size++;
    }
         int pop(){
             if(isEmpty()){
                 System.out.println("Queue is empty");
                 return -1;

             }
             int element = start.data;
             start = start.next;
             size--;
             if(size == 0){
                 start = null;
                 end = null;
             }
             return element;
        }
         int peek(){
             if(isEmpty()){
                 System.out.println("Queue is empty");
                 return -1;
             }
             else{
                 return start.data;
             }
        }
         int size(){
             return size;
        }
         void print(){
        Node head = start;
        for(int i = 0; i < size; i++){
            System.out.println(start.data + " ");
            start = start.next;
        }
        start = head;
        }

     public static void main(String[] args) {
         Queue_using_LinkedList q2 = new Queue_using_LinkedList();
         q2.push(26);
         q2.push(32);
         q2.push(516);
         q2.push(85);
         q2.push(64);
         q2.push(74);
         System.out.println( "Popped element is : " + q2.pop());
         System.out.println( "Popped element is : " + q2.pop());
         System.out.println( "Top element is : " + q2.peek());
         System.out.println("Size of queue is : " + q2.size());
         q2.print();
         q2.push(10);
         System.out.println();
         q2.print();
     }
    }



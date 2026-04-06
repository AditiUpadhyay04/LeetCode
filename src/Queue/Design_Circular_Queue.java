package Queue;

public class Design_Circular_Queue {
        int size;
        int currSize ;
        int front;
        int rear;
        int[] arr;
        public Design_Circular_Queue(int k) {
            size = k;
            arr = new int[k];
            front = -1;
            rear = -1;
            currSize = 0;
        }

        public boolean enQueue(int value) {
            if(isFull()) return false;
            else{
                if(front == -1) front++;
                rear = (rear + 1) % size;
                arr[rear] = value;
                currSize++;
                return true;
            }
        }

        public boolean deQueue() {
            if(isEmpty()) return false;
            else{
                front = (front + 1) % size;
                currSize--;
                if(currSize == 0){
                    front = -1;
                    rear = -1;
                }
                return true;
            }
        }

        public int Front() {
            if(front == -1) return -1;
            else{
                return arr[front];
            }

        }

        public int Rear() {
            if(rear == -1) return -1;
            else{
                return arr[rear];
            }

        }

        public boolean isEmpty() {
            return currSize == 0;
        }

        public boolean isFull() {
            return size == currSize;
        }

    public static void main(String[] args) {

    }
}


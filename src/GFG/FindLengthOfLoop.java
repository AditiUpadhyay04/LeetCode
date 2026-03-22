package GFG;

public class FindLengthOfLoop {

        public int lengthOfLoop(Node head) {

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(fast == slow){
                    int count = 1;
                    slow = slow.next;

                    while(slow != fast){
                        slow = slow.next;
                        count++;
                    }
                    return count;
                }
            }
            return 0;
        }

    public static void main(String[] args) {

    }
}

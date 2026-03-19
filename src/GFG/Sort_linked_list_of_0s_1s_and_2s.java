package GFG;

public class Sort_linked_list_of_0s_1s_and_2s {
    /*
    class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }*/
    public Node segregate(Node head) {
        Node dummy = new Node(-1);

        if (head == null || head.next == null) return head;


        Node ZeroHead = new Node(-1);
        Node zero = ZeroHead;

        Node OneHead = new Node(-1);
        Node one = OneHead;

        Node TwoHead = new Node(-1);
        Node two = TwoHead;

        Node temp = head;


        while (temp != null) {

            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;

            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        if (OneHead.next == null) {
            zero.next = TwoHead.next;
        } else {
            zero.next = OneHead.next;
        }
        one.next = TwoHead.next;
        two.next = null;

        return ZeroHead.next;


    }


    public static void main(String[] args) {

    }
}


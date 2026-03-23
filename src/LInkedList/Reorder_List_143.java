package LInkedList;

public class Reorder_List_143 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode reverse(ListNode head){
            ListNode temp = head;
            ListNode prev = null;
            while(temp != null) {
                ListNode forward = temp.next;
                temp.next = prev;
                prev = temp;
                temp = forward;
            }
            return prev;

        }
        public void reorderList(ListNode head) {
            if(head == null || head.next == null) return;
            ListNode slow = head;
            ListNode fast = head;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode first = head;
            ListNode second = reverse(slow.next);

            slow.next = null; // link break

            while(second != null){
                ListNode temp1 = first.next;
                ListNode temp2 = second.next;
                first.next = second;
                second.next = temp1;

                first = temp1;
                second = temp2;
            }
            return;
        }

    public static void main(String[] args) {

    }
}


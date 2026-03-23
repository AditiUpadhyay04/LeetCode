package LInkedList;

public class Maximum_Twin_Sum_Linked_List_2130 {
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
        public ListNode reverseList(ListNode head) {
            ListNode temp = head;
            ListNode prev = null;
            while(temp != null){
                ListNode forward = temp.next;
                temp.next = prev;
                prev = temp;
                temp = forward;
            }
            return prev;

        }
        public int pairSum(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode first = head;
            ListNode second = reverseList(slow.next);

            int maxx = Integer.MIN_VALUE;
            while(second != null){
                maxx = Math.max((first.val + second.val ), maxx);

                first = first.next;
                second = second.next;
            }
            return maxx;
        }

    public static void main(String[] args) {

    }
}


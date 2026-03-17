package LInkedList;

public class AddTwoNumbers  {
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
    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode DummyNode = new ListNode(-1);
            ListNode curr = DummyNode;
            int sum = 0;
            int carr = 0;

            while(l1 != null|| l2 != null){
                sum = carr;
                if(l1 != null){
                    sum += l1.val;
                    l1 = l1.next;
                }
                if(l2!= null){
                    sum += l2.val;
                    l2 = l2.next;
                }
                ListNode newNode = new ListNode(sum  % 10);
                curr.next = newNode;
                curr = curr.next;
                carr = sum / 10;
            }
            if(carr != 0){
                ListNode newNode = new ListNode(carr % 10);
                curr.next = newNode;
            }
            return DummyNode.next;
        }

     */
    public static void main(String[] args) {

    }
}


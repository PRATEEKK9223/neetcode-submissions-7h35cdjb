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

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode privious=null;
        ListNode current=head;
        ListNode ahead=head;

        while(ahead!=null){
            ahead=current.next;
            current.next=privious;
            privious=current;
            current=ahead;
        }
        return head=privious;
    }
}

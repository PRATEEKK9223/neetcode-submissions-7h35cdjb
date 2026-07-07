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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode head2=reverse(slow);

        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(head!=slow && head2!=null){
            temp.next=head;
            temp=temp.next;
            head=head.next;
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }

        while(head!=slow){
            temp.next=head;
            temp=temp.next;
            head=head.next;
        }

        while(head2!=null){
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }

        head=dummy.next;

    }

    public static ListNode reverse(ListNode head){
        ListNode privious=null;
        ListNode current=head;
        ListNode ahead=head;

        while(ahead!=null){
            ahead=current.next;
            current.next=privious;
            privious=current;
            current=ahead;
        }

        return privious;

    }
}

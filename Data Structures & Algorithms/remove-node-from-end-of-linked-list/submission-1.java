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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=getLength(head);
        int i=0;
        int loop=len-n;
        ListNode temp=head;
        ListNode prev=head;
        if(loop==0){
            return head.next;
        }
        
        while(i<loop ){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=temp.next;

        return head;
    }

    public static int getLength(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }
}

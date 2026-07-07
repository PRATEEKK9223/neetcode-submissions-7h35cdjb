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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
         if(list2==null){
            return list1;
        }
        ListNode head=null;
        ListNode temp=head;
        ListNode l1=list1;
        ListNode l2=list2;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                if(head==null){
                    head=l1;
                    l1=l1.next;
                    temp=head;
                }else{
                    temp.next=l1;
                    l1=l1.next;
                    temp=temp.next;
                }
            }else{
                if(head==null){
                    head=l2;
                    l2=l2.next;
                    temp=head;
                }else{
                    temp.next=l2;
                    l2=l2.next;
                    temp=temp.next;
                }
            }
        }

        while(l1!=null){
            temp.next=l1;
            l1=l1.next;
            temp=temp.next;
        }

        while(l2!=null){
            temp.next=l2;
            l2=l2.next;
            temp=temp.next;
        }

        return head;
    }
}
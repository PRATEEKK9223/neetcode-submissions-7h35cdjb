/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;

        while(temp!=null){
            Node dummy=new Node(temp.val);
            map.put(temp,dummy);
            temp=temp.next;
        }
        Node temp2=head;
        Node newHead=map.get(head);
        Node t3=newHead;
        while(temp2!=null ){
            t3.next=map.get(temp2.next);
            t3.random=map.get(temp2.random);
            temp2=temp2.next;
            t3=t3.next;    
        }
        return newHead;
    }
}

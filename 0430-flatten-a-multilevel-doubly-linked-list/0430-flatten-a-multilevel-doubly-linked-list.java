/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp1=head;
        while(temp1!=null){
            if(temp1.child!=null){
                Node temp2=temp1.child;
                Node temp3=temp1.next;
                temp1.next=temp2;
                temp2.prev=temp1;
                temp1.child=null;
                while(temp2.next!=null){
                    temp2=temp2.next;
                }
                if(temp3!=null){
                temp2.next=temp3;
                temp3.prev=temp2;
                }
            }
            temp1=temp1.next;
        }
        return head;
    }
}
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        ListNode curr=head;
        ListNode prev=null;
        k=k%n;
        for(int i=0;i<n-k;i++){
            prev=curr;
            curr=curr.next;
        }
        head=curr;
        prev.next=null;
        return curr;
    }
}
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int pos=1;
        ListNode oddhead=null,oddtail=null;
        ListNode evenhead=null, eventail=null;
        while(temp!=null){
            if(pos%2==0){
                if(evenhead==null){
                    evenhead=eventail=temp;
                }
                else{
                    eventail.next=temp;
                    eventail=temp;
                }
            }
            else{
                if(oddhead==null){
                    oddtail=oddhead=temp;
                }
                else{
                    oddtail.next=temp;
                    oddtail=temp;
                }
            }
            pos++;
            temp=temp.next;
        }
        oddtail.next=evenhead;
        eventail.next=null;
        return oddhead;
    }
}
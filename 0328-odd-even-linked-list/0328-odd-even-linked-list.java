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
        if(head==null) return null;
        ListNode temp=head;
        ListNode evenhead=null, eventail=null;
        ListNode oddhead=null, oddtail=null;
        int pos=1;
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
                    oddhead=oddtail=temp;
                }
                else{
                    oddtail.next=temp;
                    oddtail=temp;
                }
            }
            pos++;
            temp=temp.next;
        }
        if(eventail!=null) eventail.next=null;
        if(oddtail!=null) oddtail.next=null;
        oddtail.next=evenhead;
        return oddhead;
    }
}
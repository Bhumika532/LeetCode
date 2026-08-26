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
        if(head==null || head.next==null) return null;
        ListNode temp1=head;
        int count=0;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        int s=count-n;
        if(s==0){
            return head.next;
        }
        ListNode temp2=head;
        for(int i=0;i<s-1;i++){
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return head;
    }
}
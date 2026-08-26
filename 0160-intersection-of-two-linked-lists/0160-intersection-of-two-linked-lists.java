/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headA;
        ListNode q=headB;
        while(p!=q){
            if(p==null){
                p=headB;
            }
            if(q==null){
                q=headA;
            }
            p=p.next;
            q=q.next;
        }
        if(p==q){
            return p;
        }
        return null;
    }
}
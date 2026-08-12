// Last updated: 8/12/2026, 9:33:54 PM
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
        int l=1;
        if(head==null || head.next==null)
            return head;
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
                l++;
            }
            if(k%l==0)
            return head;
            else{
        while(k%l>0){
             temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            ListNode tail=temp.next;
            temp.next=null;
            tail.next=head;
            head=tail;
            k--;
        }
            }
        return head;
    }
}
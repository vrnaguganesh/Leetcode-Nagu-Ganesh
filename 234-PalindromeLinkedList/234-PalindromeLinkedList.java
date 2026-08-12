// Last updated: 8/12/2026, 9:32:22 PM
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp =head;
        ListNode curr=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        
        while(curr!=null){
            if(curr.val!=st.pop()  ){
               return false;
            }
            curr=curr.next;
            
        }
        return true;

        // while(current.next!=null){
        //     if(current.val==current.next.val)
        //     current=current.next;
        // }
        // ListNode tail=current;
        //     if(head.val==tail.val){
        //         return true;
        //     }
        //     else
        //     return false;
        
       
    }
}
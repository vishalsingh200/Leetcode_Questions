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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) 
            return null;
        
        ListNode u = head;
        while(u.next != null) {
		
            if(u.next.val == u.val) {
                u.next = u.next.next;
			} else {
                u = u.next;
            }            
        }
        return head;
    }
}
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
    public ListNode swapPairs(ListNode head) {
        // if(head == null || head.next == null){
        //     return head;
        // }
        // ListNode node = head.next; // 1
        // head.next = swapPairs(head.next.next); ///1 = swapPairs(2)
        // node.next = head;    //2 = head
        // return node;         // 2 -> 1
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        ListNode prev = null;
        while(head != null && head.next != null){
            ListNode nextNode = head.next;
            ListNode nextPair = nextNode.next;
            
            nextNode.next = head;
            head.next = nextPair;
            
            if(prev != null){
                prev.next = nextNode;
            }
            prev = head;
            head = nextPair;
        }
        return newHead;
    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;     // two pointer
        ListNode fast = head;
        
        while(fast != null && fast.next != null)    //loop
        {
            slow = slow.next;         // one (1) step 
            fast = fast.next.next;    // two(2) step
            if(slow == fast)          
            return true;
        }
        return false;
        
    }
}
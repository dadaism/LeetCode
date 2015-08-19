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
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head==null) return false;
        if (head.next==null) return false;
        if (head==head.next) return true;
        ListNode s = head;
        ListNode t = head;
        
        while(true) {
        	if (t.next==null) return false;
        	if (t.next.next==null) return false;
        	t = t.next.next;
        	s = s.next;
        	if ( t==s )	return true;
        }
    }
}

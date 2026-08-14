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
     ListNode fast ;
     ListNode slow ;
    public boolean isloop(ListNode head){
        fast =head;
        slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;
            if(fast==slow){
                return true;
            }
   }
 return false;    }
    public ListNode detectCycle(ListNode head) {
        if(isloop(head)){
            if(head.next == null || head == null){
                return null;
            }
         slow = head;
        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
  return slow;
        }
    return null;      }
}
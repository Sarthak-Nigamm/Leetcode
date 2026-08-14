/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
          ListNode temp = node;
          ListNode prev = null;
          while(temp.next!=null){
            prev = temp;
            temp = temp.next;
            node.val = node.next.val;
            node = node.next;
          }
          prev.next = null;
    }
}
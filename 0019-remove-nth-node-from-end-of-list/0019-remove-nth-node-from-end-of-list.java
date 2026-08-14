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
        //nth node from last == total - n+1 th node from 1st
        int size = 0;
        ListNode temp =head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if((size-n+1)<1) {
            ListNode a = new ListNode(-1);
            return a;
        }
        int first = size-n+1;
        if(first==1){
            return head.next;
        }
        ListNode prev = null;
        temp = head;
        while(first!=1){
            prev =temp;
            temp = temp.next;
            first--;
        }
        prev.next = temp.next;
 return head;   }
}
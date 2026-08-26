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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(-1);
         ListNode mh = merged; 
        ListNode i = list1;
        ListNode j = list2;
        while(i!=null && j!=null ){
            if(i.val<j.val){
                merged.next = i;
                merged = merged.next;
                i=i.next;
            }else{
                merged.next = j;
                merged = merged.next;
                j = j.next;
            }
        }
        while(i!=null){
            merged.next = i;
            merged = merged.next;
            i=i.next;
        }
         while(j!=null){
            merged.next = j;
            merged = merged.next;
            j=j.next;
        }
   return mh.next; }
}
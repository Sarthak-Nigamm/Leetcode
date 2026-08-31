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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // Base condition: Agar minimum 3 nodes nahi hain toh critical points hona impossible hai
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        int index = 2; // curr position is at index 2

        int firstCritical = -1;
        int prevCritical = -1;
        int minDistance = Integer.MAX_VALUE;

        while (curr.next != null) {
            boolean isLocalMaxima = curr.val > prev.val && curr.val > curr.next.val;
            boolean isLocalMinima = curr.val < prev.val && curr.val < curr.next.val;

            if (isLocalMaxima || isLocalMinima) {
                if (firstCritical == -1) {
                    firstCritical = index;
                } else {
                    minDistance = Math.min(minDistance, index - prevCritical);
                }
                prevCritical = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        // Agar 2 se kam critical points mile hain
        if (minDistance == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        int maxDistance = prevCritical - firstCritical;
        return new int[]{minDistance, maxDistance};
    }
}
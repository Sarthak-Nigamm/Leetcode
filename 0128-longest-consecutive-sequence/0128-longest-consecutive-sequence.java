import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Base case: agar array empty hai
        if (nums == null || nums.length == 0) return 0;
        
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        int longest = 1;
        int currentStreak = 1;
        
        // Step 2: Single pass mein streak count karo
        for (int i = 1; i < nums.length; i++) {
            // Duplicate case: skip karo
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            // Consecutive case: streak badhao
            else if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } 
            // Break case: sequence toot gayi
            else {
                longest = Math.max(longest, currentStreak);
                currentStreak = 1;
            }
        }
        
        // Final result: last streak aur longest ka max
        return Math.max(longest, currentStreak);
    }
}
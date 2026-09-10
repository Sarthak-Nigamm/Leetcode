class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if mid and its pair match
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1; // Element right half me hai
            } else {
                high = mid;    // Element left half me ya mid par hai
            }
        }

        return nums[low];
    }
}
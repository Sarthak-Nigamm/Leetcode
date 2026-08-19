class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        
        // Agar target array mein hai hi nahi
        if (first == -1) {
            return new int[]{-1, -1};
        }
        
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid; // Possible boundary store karo
                if (isFirst) {
                    high = mid - 1; // Left direction mein continue karo
                } else {
                    low = mid + 1;  // Right direction mein continue karo
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        
        for (int num : nums) {
            low = Math.max(low, num); // Max element in nums
            high += num;             // Sum of all elements
        }
        
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canSplit(nums, k, mid)) {
                ans = mid;
                high = mid - 1; // Try to find a smaller valid maximum sum
            } else {
                low = mid + 1;  // Increase the limit
            }
        }
        
        return ans;
    }
    
    private boolean canSplit(int[] nums, int k, int maxAllowedSum) {
        int subarrayCount = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > maxAllowedSum) {
                subarrayCount++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }
        
        return subarrayCount <= k;
    }
}
class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Agar target mil gaya
            if (nums[mid] == target) {
                return true;
            }
            
            // TRICKY PART: Jab array ke extremes aur mid same ho jayein
            // Hum sorted half identify nahi kar sakte, toh search space shrink karo
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            
            // Check karo ki Left half sorted hai ya nahi
            if (nums[low] <= nums[mid]) {
                // Agar target left half ki range me aata hai
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Left me jao
                } else {
                    low = mid + 1;  // Right me jao
                }
            } 
            // Agar left sorted nahi hai, toh pakka Right half sorted hoga
            else {
                // Agar target right half ki range me aata hai
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;  // Right me jao
                } else {
                    high = mid - 1; // Left me jao
                }
            }
        }
        
        return false; // Agar poora array dhoond liya aur nahi mila
    }
}
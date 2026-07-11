class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Agar mid element rightmost se bada hai, 
            // iska matlab minimum element right side mein hai
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Warna minimum element ya toh khud mid hai ya uske left mein hai
            else {
                right = mid;
            }
        }
        
        // Jab left aur right barabar ho jayenge, wahi hamara minimum element hoga
        return nums[left];
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // i chalega second-last element tak
        for (int i = 0; i < nums.length - 1; i++) {
            // j hamesha i ke aage se shuru hoga
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Direct array return kar do
                }
            }
        }
        return new int[] {}; // Agar koi pair na mile 
    }
}
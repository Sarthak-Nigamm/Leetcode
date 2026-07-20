class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            int hLeft = height[left];
            int hRight = height[right];
            
            // Find the shorter line using a ternary operator (faster than Math.min)
            int minHeight = hLeft < hRight ? hLeft : hRight;
            
            // Calculate area and update maxArea
            int currentArea = (right - left) * minHeight;
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            
            // Fast-forward the left pointer if the next lines are shorter or equal
            while (left < right && height[left] <= minHeight) {
                left++;
            }
            // Fast-forward the right pointer if the next lines are shorter or equal
            while (left < right && height[right] <= minHeight) {
                right--;
            }
        }
        
        return maxArea;
    }
}
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        
        while (left < right) {
            // Calculate the area with the current left and right pointers
            int currentWidth = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = currentWidth * currentHeight;
            
            // Update the maximum water seen so far
            maxWater = Math.max(maxWater, currentArea);
            
            // Move the pointer that points to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}
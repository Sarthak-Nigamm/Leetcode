class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        // DP table for memoization to store intermediate state results
        Integer[][] dp = new Integer[n][n];
        
        // Returns (Player1 Score - Player2 Score)
        int scoreDifference = solve(nums, 0, n - 1, dp);
        
        // If difference >= 0, Player 1 wins or ties
        return scoreDifference >= 0;
    }
    
    private int solve(int[] nums, int i, int j, Integer[][] dp) {
        // Base Case: jab ek hi element bacha ho, toh player wahi pick karega
        if (i == j) {
            return nums[i];
        }
        
        // Return already calculated state
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        
        // Choice 1: Left pick kiya
        int pickLeft = nums[i] - solve(nums, i + 1, j, dp);
        
        // Choice 2: Right pick kiya
        int pickRight = nums[j] - solve(nums, i, j - 1, dp);
        
        // Return the maximum score difference player can achieve
        return dp[i][j] = Math.max(pickLeft, pickRight);
    }
}
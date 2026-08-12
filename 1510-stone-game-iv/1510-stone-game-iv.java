class Solution {
    public boolean winnerSquareGame(int n) {
        // dp[i] true hoga agar 'i' stones ke saath start karne wala player jeet sakta hai
        boolean[] dp = new boolean[n + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k * k <= i; k++) {
                // Agar Alice k*k stones remove kare aur remaining (i - k*k) stones se
                // next player (Bob) haar raha ho (!dp[i - k*k]), toh Alice jeet jayegi.
                if (!dp[i - k * k]) {
                    dp[i] = true;
                    break; // Ek winning move mil gaya, toh aage check karne ki zarurat nahi
                }
            }
        }
        
        return dp[n];
    }
}




class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long low = 1;
        long minCoin = coins[0];
        for (int coin : coins) {
            minCoin = Math.min(minCoin, coin);
        }
        long high = minCoin * (long) k;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (countMultiples(mid, coins) >= k) {
                ans = mid;
                high = mid - 1; // Try smaller value
            } else {
                low = mid + 1; // Need a larger value
            }
        }
        return ans;
    }

    // Counts numbers <= target divisible by at least one coin in array
    private long countMultiples(long target, int[] coins) {
        long count = 0;
        int n = coins.length;

        // Iterate through all non-empty subsets (1 to 2^n - 1)
        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            int setBits = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    setBits++;
                    lcm = getLCM(lcm, coins[i]);
                    if (lcm > target) break; // Optimization
                }
            }

            if (setBits % 2 == 1) {
                count += target / lcm;
            } else {
                count -= target / lcm;
            }
        }
        return count;
    }

    private long getGCD(long a, long b) {
        return b == 0 ? a : getGCD(b, a % b);
    }

    private long getLCM(long a, long b) {
        return (a / getGCD(a, b)) * b;
    }
}
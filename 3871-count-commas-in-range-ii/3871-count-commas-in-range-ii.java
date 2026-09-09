    class Solution {
    public long countCommas(long n) {
        long count = 0;
        long base = 1000;
        
        // Add commas for every threshold (10^3, 10^6, 10^9, etc.) that 'n' exceeds
        while (n >= base) {
            count += (n - base + 1);
            base *= 1000;
        }
        
        return count;
    }
} 
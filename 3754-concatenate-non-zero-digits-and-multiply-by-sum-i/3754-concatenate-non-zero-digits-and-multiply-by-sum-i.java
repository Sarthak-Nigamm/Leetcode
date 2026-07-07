class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;          // Isko long kar diya overflow se bachne ke liye
        long sum = 0;        
        long multiplier = 1; // Math.pow ki jagah simple multiplier (fast hai)
        int dig = n;
        
        while (dig > 0) {
            int ld = dig % 10;
            if (ld != 0) {
                x = x + (ld * multiplier);
                sum += ld;
                multiplier *= 10; // Place value tabhi badhega jab digit non-zero ho
            }
            dig /= 10;
        }
        
        return x * sum; 
    }
}
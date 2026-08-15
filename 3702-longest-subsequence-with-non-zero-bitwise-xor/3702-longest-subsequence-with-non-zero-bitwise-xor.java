class Solution {
    public int longestSubsequence(int[] nums) {      
        int totalXor = 0;
        boolean allZeros = true;

        for (int num : nums) {
            totalXor ^= num;
            if (num != 0) {
                allZeros = false;
            }
        }

        // Case 1: Saare elements 0 hain
        if (allZeros) {
            return 0;
        }

        // Case 2: Agar pure array ka XOR non-zero hai, toh pure array ki length le lo
        if (totalXor != 0) {
            return nums.length;
        }

        // Case 3: Agar overall XOR zero hai, toh ek element hatane par XOR non-zero ho jayega
        return nums.length - 1;
    }
}
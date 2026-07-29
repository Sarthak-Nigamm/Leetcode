class Solution {
    public String smallestPalindrome(String s, int k) {
       int[] freq = new int[26];
        // Characters ki frequency nikal lo
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int[] halfFreq = new int[26];
        String midChar = "";
        int halfLength = 0;
        
        // Palindrome ke first half ke liye data set karo
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                midChar = String.valueOf((char)(i + 'a'));
            }
            halfFreq[i] = freq[i] / 2;
            halfLength += halfFreq[i];
        }
        
        // Check karo ki k available permutations se bada toh nahi hai
        long totalWays = getWays(halfFreq);
        if (k > totalWays) {
            return "";
        }
        
        StringBuilder leftPart = new StringBuilder();
        long currentK = k;
        
        // Ek-ek position ke liye character decide karo
        for (int i = 0; i < halfLength; i++) {
            for (int j = 0; j < 26; j++) {
                if (halfFreq[j] > 0) {
                    // Try placing this character
                    halfFreq[j]--;
                    long ways = getWays(halfFreq);
                    
                    if (currentK <= ways) {
                        // Ye character fix ho gaya
                        leftPart.append((char)(j + 'a'));
                        break;
                    } else {
                        // Ye nahi aayega, options minus karo aur aage badho
                        currentK -= ways;
                        halfFreq[j]++; // backtrack
                    }
                }
            }
        }
        
        String left = leftPart.toString();
        String right = leftPart.reverse().toString();
        
        return left + midChar + right;
    }
    
    // Total valid permutations nikalne ka helper function
    private long getWays(int[] freq) {
        int rem = 0;
        for (int f : freq) rem += f;
        
        long ways = 1;
        for (int f : freq) {
            if (f > 0) {
                long c = nCr(rem, f);
                // Capping it to prevent overflow
                if (c >= (long)1e12 || ways >= (long)1e12 / c + 1) {
                    return (long)1e12; 
                }
                ways *= c;
                rem -= f;
            }
        }
        return ways;
    }
    
    // nCr calculate karne ka safe tareeka (combinations)
    private long nCr(int n, int r) {
        if (r > n - r) r = n - r; // nCr(n, r) == nCr(n, n-r)
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
            // Agar value 10^12 se upar jaa rahi hai toh cap kardo (kyunki k <= 10^6 hai)
            if (res >= (long)1e12) {
                return (long)1e12;
            }
        }
        return res;
    }
}
class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        
        // Character counts track karne ke liye 26 size ka simple array
        int[] freq = new int[26];

        for (int right = 0; right < n; right++) {
            int charIdx = s.charAt(right) - 'a';
            freq[charIdx]++;

            // Agar kisi char ka count 2 se bada ho gaya, 
            // toh left pointer ko aage badao jab tak count valid na ho jaye
            while (freq[charIdx] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            // Current valid window ki maximum length update karo
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
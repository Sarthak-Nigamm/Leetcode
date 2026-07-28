class Solution {
    public String smallestPalindrome(String s) {
        // 26 characters ki limit hoti hai alphabet mein
        int[] arr = new int[26];

        // Step 1: Har character ka frequency count nikal lo
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        String mid = "";

        // Step 2: Left half build karna aur Mid character dhoondhna
        for (int i = 0; i < 26; i++) {
            
            // Character ko left half mein frequency ke theek aadhe times add karo
            for (int j = 0; j < arr[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }
            
            // Agar frequency odd hai, toh ek akela bacha character beech (mid) mein aayega
            if (arr[i] % 2 != 0) {
                mid = String.valueOf((char) (i + 'a'));
            }
        }

        // Step 3: Right half ke liye left ko seedha reverse maar do
        StringBuilder right = new StringBuilder(left).reverse();

        // Step 4: Sabko ek saath jod ke return kar do
        return left.toString() + mid + right.toString();
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        // Store last seen positions (+1 to avoid default 0 conflict)
        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Agar pehle alag positions par dekhe gaye hain, mapping break hui
            if (m1[ch1] != m2[ch2]) {
                return false;
            }

            // Current 1-based index store karo
            m1[ch1] = i + 1;
            m2[ch2] = i + 1;
        }

        return true;
    }
}
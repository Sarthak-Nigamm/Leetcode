class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String ans = "";
        int onesCount = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (s.charAt(right) == '1') {
                onesCount++;
            }

            // Jab tak count k ke barabar hai, window shrink karke valid substrings check karo
            while (onesCount == k) {
                // Leading zeros ko skip karo
                while (s.charAt(left) == '0') {
                    left++;
                }

                String candidate = s.substring(left, right + 1);

                // Best answer update karo agar shorter length mile ya lexicographically chota ho
                if (ans.equals("") || candidate.length() < ans.length() || 
                   (candidate.length() == ans.length() && candidate.compareTo(ans) < 0)) {
                    ans = candidate;
                }

                // Left pointer ko move karke count adjust karo
                if (s.charAt(left) == '1') {
                    onesCount--;
                }
                left++;
            }
        }

        return ans;
    }
}
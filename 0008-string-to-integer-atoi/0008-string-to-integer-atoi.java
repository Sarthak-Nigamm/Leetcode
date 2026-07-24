class Solution {
    
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;

        // Step 1: Shuruwati spaces ko ignore karna
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Agar string mein sirf spaces the ya empty thi
        if (i >= n) {
            return 0;
        }

        // Step 2: Sign check karna
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Yahan se apna recursive function call hoga
        return getAtoiRecursive(s, i, sign, 0);
    }

    // Yeh apna Recursive Helper Function hai
    private int getAtoiRecursive(String s, int i, int sign, int result) {
        // Base Case 1: Agar index string ki length se bahar ho jaye
        // Base Case 2: Agar current character number (digit) na ho
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return result * sign;
        }

        int digit = s.charAt(i) - '0'; // Character ko integer mein badalna

        // Overflow condition check karna
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        // Naya result calculate karna
        int newResult = result * 10 + digit;

        // Recursive Call: Index (i) ko +1 karke aage badha diya
        return getAtoiRecursive(s, i + 1, sign, newResult);
    }
}
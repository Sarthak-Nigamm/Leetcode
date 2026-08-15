class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Outer '(' ke alawa baaki saare '(' add karo
                if (count > 0) {
                    result.append(c);
                }
                count++;
            } else {
                count--;
                // Outer ')' ke alawa baaki saare ')' add karo
                if (count > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
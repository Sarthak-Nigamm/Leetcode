class Solution {
    public String largestOddNumber(String s) {
        // Right to left traverse karte hain
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            // Check agar character odd digit hai
            if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9') {
                return s.substring(0, i + 1);
            }
        }
        
        // Agar koi odd digit nahi mila
        return "";
    }
}
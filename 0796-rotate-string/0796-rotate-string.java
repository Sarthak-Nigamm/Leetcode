class Solution {
    public boolean rotateString(String s, String goal) {
        // Step 1: Length check (Dono length same honi chahiye)
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Step 2: Check if goal is a substring of (s + s)
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i <= j) {
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);
            
            // Step 1: Agar left character alphanumeric nahi hai, toh isko skip karo aur 'i' ko aage badhao
            if (!Character.isLetterOrDigit(leftChar)) {
                i++;
            } 
            // Step 2: Agar right character alphanumeric nahi hai, toh isko skip karo aur 'j' ko peeche laao
            else if (!Character.isLetterOrDigit(rightChar)) {
                j--;
            } 
            // Step 3: Agar dono pointers alphanumeric par hain, tab unko lowercase karke compare karo
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false; // Agar match nahi kiye, toh palindrome nahi hai
                }
                
                // Agar match kar gaye, toh dono pointers ko move karo
                i++;
                j--;
            }
        }
        
        return true;
    }
}
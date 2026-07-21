class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        
        while (i >= 0) {
            // Step 1: Extra dots ko skip karo (piche se aate hue)
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            
            // Agar string khatam ho gayi aur bas dots hi the, toh loop tod do
            if (i < 0) {
                break;
            }
            
            // Step 2: Word ka aakhiri character mil gaya
            int j = i; 
            
            // Step 3: Piche jaate raho jab tak agla dot na mil jaye (ya string khatam na ho)
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            
            // Step 4: Word ko StringBuilder mein daal do
            // Agar StringBuilder khali nahi hai, matlab pehle koi word aa chuka hai, 
            // toh naye word se pehle ek single dot lagao
            if (sb.length() > 0) {
                sb.append(' ');
            }
            
            // Ab pure word ko sidha karke (i+1 se j tak) append kar do
            for (int k = i + 1; k <= j; k++) {
                sb.append(s.charAt(k));
            }
        }
        
        return sb.toString();
    }
}
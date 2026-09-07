class Solution {
    // Helper function to check if character is a vowel
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            // Left pointer ko next vowel tak le jayein
            while (i < j && !isVowel(arr[i])) {
                i++;
            }
            // Right pointer ko previous vowel tak le jayein
            while (i < j && !isVowel(arr[j])) {
                j--;
            }

            // Vowels ko swap karein
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }
}
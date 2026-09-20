class Solution {
    public int reverseDegree(String s) {
        int arr[] = new int[26];
        int count = 26;
        for(int i = 0; i<26; i++){
            arr[i] = count;
            count--;
        }
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int a = (int)(ch - 'a');
            sum+= (arr[a] * (i+1));
        }
   return sum;}
}
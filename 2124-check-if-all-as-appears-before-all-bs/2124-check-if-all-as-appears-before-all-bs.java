class Solution {
    public boolean checkString(String s) {
        int i = 0;
        char ch = s.charAt(i);
        while((ch!='b') && i<s.length()){
            ch = s.charAt(i);
            i++;
        }
        if(i<s.length()){
        ch = s.charAt(i);}
        while(i<s.length()){
            ch = s.charAt(i);
            if(ch=='a'){return false;}
            i++;
        }

    return true;}
}
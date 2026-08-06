class Solution {
    public int smallestNumber(int n, int t) {

        int i = n;
        while(true){
        int temp = i;
        int digit = temp;
        int prod = 1;
        while(temp>0){
            int ld = temp%10;
            temp/=10;
            prod *=ld;
        }
        if(prod%t==0){
            return digit;
        }
        i++;
        }
 }
}
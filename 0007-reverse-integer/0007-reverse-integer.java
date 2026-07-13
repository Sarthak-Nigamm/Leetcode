class Solution {
    public int reverse(int x) {
        boolean isnegative = false;
        if(x<0){
            isnegative = true;
            x = Math.abs(x);
        }
        int dig = x;
        long rev = 0;
        while(dig>0){
            int ld = dig%10;
            dig/=10;
           rev =  rev*10+ld;
        }
        if(rev<Math.pow(-2,31) || rev>Math.pow(2,31)){
            return 0;
        }
        if(isnegative){
            rev = rev*-1;
        }
        return (int)rev;}
    }
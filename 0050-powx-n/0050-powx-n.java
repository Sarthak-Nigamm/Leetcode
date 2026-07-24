class Solution {
    public double mypow2(double x, int n){
         if(n==0 || n==1){
            return n==0 ? 1 : x;
        }
        double haf = mypow2(x,n/2);
        double halfsq = haf*haf;
        if(n%2!=0){
            halfsq*=x;
        }
        return halfsq;
    }
    public double myPow(double x, int n) {
        if(n>=0){
        return mypow2(x,n);
        }
    else{
    return 1/mypow2(x,n);
    }
}}
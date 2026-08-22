class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int sod = 0;
        int pod = 1;
        while(a!=0){
            int ld = a%10;
            a/=10;
            sod+=ld;
            pod*=ld;
        }
        int div = sod+pod;
   return n%div == 0;  }
}
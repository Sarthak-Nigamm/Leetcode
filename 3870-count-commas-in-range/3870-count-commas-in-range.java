class Solution {
    public int count(int n){
        int count = 0;
        while(n%1000!=n){
            count++;
            n/=1000;
        }
      return count; 
    }
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int count = 0;
        for(int i =1000; i<=n; i++){
            int a =count(i);
            count+=a;
        }
      return count; }
}
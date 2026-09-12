class Solution {
 public int maxProfit(int[] arr) {
        int bp = Integer.MAX_VALUE;
        int p = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=bp){
                int cp = arr[i]- bp;
                p = Math.max(p,cp);
            }else{
                bp =arr[i];
            }
        }


 return p;}}
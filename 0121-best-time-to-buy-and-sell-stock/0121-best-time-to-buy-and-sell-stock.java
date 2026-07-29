class Solution {
 public int maxProfit(int[] prices) {
int buyprice = Integer.MAX_VALUE;
int tolprof = 0;
for(int i = 0; i < prices.length; i++){
    if(buyprice < prices[i]){
        int prof = prices[i] - buyprice;
        tolprof =Math.max(tolprof,prof); 
    } else {
        buyprice = prices[i]; 
    }
}
   return tolprof; }
}
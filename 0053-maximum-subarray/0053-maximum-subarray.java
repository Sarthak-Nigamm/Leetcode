class Solution {
    public int maxSubArray(int[] arr) {
        int max_sum = 0;
        int curr_sum=0;
        for(int i =0; i<arr.length; i++){
        
            curr_sum += arr[i]; 
            if(curr_sum <0){
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum,curr_sum);
        }
        if(max_sum == 0){
            max_sum = Integer.MIN_VALUE;
            for(int i =0; i<arr.length; i++){
                max_sum = Math.max(max_sum,arr[i]);
            }
        }

   return max_sum; }
}

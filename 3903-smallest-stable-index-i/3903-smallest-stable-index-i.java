class Solution {
    public int leftmax(int nums[], int i){
       int max = Integer.MIN_VALUE;
       for(int j = i; j>=0; j--){
        max = Math.max(max , nums[j]);
       }
       return max;
    }
    public int rightmin(int nums[], int i){
       int min = Integer.MAX_VALUE;
       for(int j = i; j<nums.length; j++){
        min = Math.min(min,nums[j]);
       }
       return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        for(int i = 0; i<nums.length; i++){
           int ss =  leftmax(nums,i) - rightmin(nums,i);
           if(ss<=k){
            return i;
           }
        }
   return -1; }
}
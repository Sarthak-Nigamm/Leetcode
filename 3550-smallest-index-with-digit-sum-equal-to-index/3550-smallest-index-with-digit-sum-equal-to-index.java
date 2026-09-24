class Solution {
    public int digitSum(int d){
        int sum = 0;
        while(d>0){
            sum+=(d%10);
             d/=10;
        }
    return sum;}
    public int smallestIndex(int[] nums) {
        for(int i =0; i<nums.length; i++){
            if(digitSum(nums[i])==i){
                return i;
            }
        }
   return -1; }
}
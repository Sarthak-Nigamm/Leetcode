class Solution {
    public int digitSum(int d){
        int sum = 0;
        while(d>0){
            int ld = d%10;
            d/=10;
            sum+=ld;
        }
    return sum;}
    public int smallestIndex(int[] nums) {
        for(int i =0; i<nums.length; i++){
            int a = digitSum(nums[i]);
            if(a==i){
                return i;
            }
        }
   return -1; }
}
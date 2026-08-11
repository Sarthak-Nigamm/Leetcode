class Solution {
    public int missingInteger(int[] nums) {
       int sum = nums[0];
        for(int i =1; i<nums.length; i++){
            if(nums[i]== nums[i-1]+1){
             sum+=nums[i];
            }else{
                break;
            }
        }
        boolean exist = true;
        int i = 0;
        while(exist){
            for(int j = 0; j<nums.length; j++){
                if(nums[j] != sum){
                    exist = false;
                }else{
                    exist = true;
                    sum+=1;
                    break;
                }
            }   
        }
   return sum; }
}
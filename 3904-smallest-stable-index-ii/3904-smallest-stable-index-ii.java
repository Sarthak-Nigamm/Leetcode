class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int lm[] = new int[n];
        lm[0] = nums[0];
        for(int i =1; i<n; i++){
            lm[i] = Math.max(lm[i-1], nums[i]);
        }
        int rm[]  = new int[n];
        rm[n-1] = nums[n-1];
        for(int i =n-2; i>=0; i--){
            rm[i] = Math.min(rm[i+1], nums[i]);
        }
        for(int i =0; i<n; i++){
            if(lm[i] - rm[i] <=k){
                return i;
            }
        }
  return -1;  }
}
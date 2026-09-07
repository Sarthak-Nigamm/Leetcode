class Solution {
    public void moveZeroes(int[] nums) {
        int arr[] = new int[nums.length];
        int k=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]!=0){
                arr[k] = nums[i];
                k++;
            }
        }    
    for(int c =0; c<arr.length; c++){
        nums[c] = arr[c];
    }
      }
}
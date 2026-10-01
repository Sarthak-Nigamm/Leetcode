class Solution {
    public int search(int[] nums, int k) {
       int si = 0;
       int ei = nums.length-1;
       while(si<=ei){
        int mid = si+(ei-si)/2;
        if(nums[mid] == k){
            return mid;
        }
        else if(nums[mid]>k){
            ei = mid-1;
        }else{
            si = mid+1;
        }
       }
       return -1; }
}
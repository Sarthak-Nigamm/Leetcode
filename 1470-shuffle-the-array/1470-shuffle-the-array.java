class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j = n;
        int k = 0;
        int arr[] = new int[nums.length];
        for(int i =0; i<n; i++){
            arr[k] = nums[i];
            arr[k+1] = nums[j];
            j++;
            k+=2;
        }
   return arr; }
}
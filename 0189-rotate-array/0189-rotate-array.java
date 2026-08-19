class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        int j =0;
        k = k%n;
        if(k==0) return;
        for(int i =n-k; i<n; i++){
            arr[j] = nums[i];
            j++;
        }
        int i =0;
        while(i<n-k){
            arr[j] = nums[i];
            j++;
            i++;
        }
        //copy
        for (int c =0; c<n; c++){
            nums[c] = arr[c];
        }
        
}}
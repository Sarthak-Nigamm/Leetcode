class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i =0;
        int j = arr.length-1;
        int subarr [] = new int[2];
        while(i<=j){
            if(arr[i] + arr[j] == target){
                subarr[0] = i+1;
                subarr[1]=j+1;
                return subarr;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
   return subarr; }
}
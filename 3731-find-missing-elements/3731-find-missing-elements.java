class Solution {
    public static boolean isPresent(int arr[], int i) {
        for(int k = 0; k<arr.length; k++){
            if(arr[k]==i){
                return true;
            }
        }
   return false; }
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int small = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            small = Math.min(small,nums[i]);
            largest = Math.max(largest,nums[i]);
        }
       for(int i = small; i<=largest; i++){
       if(isPresent(nums,i) == false) {
        list.add(i);
       }
        }
   return list; }
}
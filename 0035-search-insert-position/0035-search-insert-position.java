class Solution {
    public int searchInsert(int[] arr, int target) {
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(arr[mid] == target){
                return mid;}
                
            else if(arr[mid]>target){
                ei = mid-1;  
            }
            else{
                si = mid+1;
            }
                    
        }
  return si; }
}
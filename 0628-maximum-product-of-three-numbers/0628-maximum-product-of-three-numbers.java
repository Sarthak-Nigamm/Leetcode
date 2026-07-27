import java.util.*;
class Solution {
    public int maximumProduct(int[] arr) {
      Arrays.sort(arr);
        int n = arr.length-1;
        if(arr[0]*arr[1]*arr[n] > arr[n]*arr[n-1]*arr[n-2]){
            return arr[0]*arr[1]*arr[n] ;
        }
        else if(arr[0]*arr[1]*arr[n] <= arr[n]*arr[n-1]*arr[n-2]){
             return arr[n]*arr[n-1]*arr[n-2] ;
        }
   return -1; }
}
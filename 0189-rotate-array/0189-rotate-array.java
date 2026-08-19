class Solution {
    public void rotate(int[] arr, int k) {
      int n = arr.length;
        k = k%n;
        if(k==0) return;
        int ei = n-1;
        int si = 0;
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei]  = temp;
            si++;
            ei--;
        }
        si = 0;
        ei = k-1;
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei]  = temp;
            si++;
            ei--;
        }
        si = k; ei = n-1;
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei]  = temp;
            si++;
            ei--;
        }
        
}}
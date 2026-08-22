class Solution {
    public boolean searchMatrix(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;
        while(j>=0 && i<n){
            if(matrix[i][j] == k){
                return true;
            }
            else if(matrix[i][j] <  k){
                i++;
            }
            else if(matrix[i][j] > k){
                j--;
            }
        }
   return false;}}
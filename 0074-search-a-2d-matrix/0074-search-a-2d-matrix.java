class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m =matrix[0].length;
        int n = matrix.length;
        int i = 0;
        int j = n*m-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            int r = mid/m;
            int c = mid%m;
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
    return false;   }
}
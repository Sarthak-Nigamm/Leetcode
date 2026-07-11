class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col= matrix[0].length-1;
        int row = 0;
        while(row<matrix.length && col>=0){
            if(target == matrix[row][col]){
                return true;
            }
            else if (target > matrix[row][col]){
                row++;
            }
            else if(target < matrix[row][col]){
                col--;
            }
        }
   return false; }
}
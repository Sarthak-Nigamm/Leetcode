class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
      for(int i = 0; i<n; i++){
        for(int j =i+1; j<n; j++){
            int tmep = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = tmep;
        }
      }
      for(int i =0; i<n; i++){
        int cs =0,ce =n-1;
        while(cs<ce){
            int temp = matrix[i][cs];
            matrix[i][cs] = matrix[i][ce];
            matrix[i][ce] = temp;
            cs++;
            ce--;
        }
      }
   
    }
}
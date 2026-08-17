class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        int m =mat[0].length;
        int i =0;
        int j =0;
        while(i<n && j<m){
            sum+=mat[i][j];
            i++;
            j++;
        }
        j=m;
        i = -1;
        while(i<n-1 && j>0){
                i++;
                j--;
            if(i==j){
                continue;
            }
            sum+=mat[i][j];
        }

 return sum;   }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Step 1: Marker arrays
        int row[] = new int[n];
        int col[] = new int[m];
        
        // Step 2: Mark kahan zero hona chahiye
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1; 
                }
            }
        }
        
        // Step 3: Matrix update karo
        // Agar us row ya column mein kahi bhi 0 mark hua hai, toh us cell ko 0 bana do
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
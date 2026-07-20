import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
    int grid2 [][]= new int[n][m];
     List<List<Integer>> result = new ArrayList<>();
      List<Integer> rowList2 = new ArrayList<>();
        // Tumhara original logic (Bina kisi change ke)
        if(k==0){
        rowList2.add(grid[0][0]);
         result.add(rowList2);
         return result;
        }
        while(k>0){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(j != m-1){
                    grid2[i][j+1]=grid[i][j];
                } else if(j == m-1 && i != n-1){
                    grid2[i+1][0]=grid[i][j];
                } else {
                   grid2[0][0] =  grid[i][j];
                }
            }
        }

        //copy grid 2 in grid 1
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                grid[i][j] = grid2[i][j];
            }
        }
        k--;
    }
        // Yahan se nayi List banane aur rows store karne ka code hai
       
        for(int i = 0; i < n; i++){
            List<Integer> rowList = new ArrayList<>();
            for(int j = 0; j < m; j++){
                rowList.add(grid2[i][j]);
            }
            result.add(rowList);
        }

        return result;
    }
}
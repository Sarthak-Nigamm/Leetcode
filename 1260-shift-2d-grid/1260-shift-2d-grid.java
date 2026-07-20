import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int totalElements = m * n;
        
        // Agar k matrix ke size se bada hai toh usko chhota kar lete hain
        k = k % totalElements; 
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                
                // Naye grid ke current cell (i, j) ki 1D position
                int targetPos = i * n + j;
                
                // Pata lagate hain ki original grid mein yeh element kahan tha
                // + totalElements isliye kiya taaki negative value na aaye
                int sourcePos = (targetPos - k + totalElements) % totalElements;
                
                // 1D position ko wapas 2D coordinates (row, col) mein convert karna
                int sourceRow = sourcePos / n;
                int sourceCol = sourcePos % n;
                
                // Original grid se value utha kar result mein daal di
                row.add(grid[sourceRow][sourceCol]);
            }
            result.add(row);
        }
        
        return result;
    }
}
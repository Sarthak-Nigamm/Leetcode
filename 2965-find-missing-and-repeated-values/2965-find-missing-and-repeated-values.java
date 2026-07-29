import java.util.*;
class Solution {
    public static boolean ispre(int[][]grid,int key){
        for(int row =0; row<grid.length; row++){
                for(int j =0; j<grid.length; j++){
                    if(grid[row][j] == key){
                        return true;
                        
                    }
                }
           }
            return false;
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        int n = grid.length;
        int arr[] = new int[n*n+1];
        for(int i =1; i<=n*n; i++){
            boolean b = ispre(grid,i);
            if(b==false){
                ans[1] = i;
            }
        }

       int k =0;
            for(int i =0; i<n; i++){
                for(int j =0; j<n; j++){
                    
                arr[k++] = grid[i][j];
                
            }
        }
      Arrays.sort(arr);
    for(int i =1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            ans[0] = arr[i];
        }
    }
      
   return ans; }}
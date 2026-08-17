import java.util.*; 
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int rs = 0, cs = 0;
        int re =n-1, ce = m-1;
        while(rs<=re && cs<=ce){
            //top
            for(int i =cs;i<=ce;i++){
                list.add(matrix[rs][i]);
            }
            rs++;
            //right
            for(int i =rs; i<=re; i++){
                list.add(matrix[i][ce]);
            }
            ce--;
            if(rs<=re){
                //bottom
                for(int i =ce; i>=cs; i--){
                    list.add(matrix[re][i]);
                }
                re--;
            }
            if(cs<=ce){
                //left
                for(int i =re; i>=rs; i--){
                    list.add(matrix[i][cs]);
                }
                cs++;
            }
        }
   return list;    }
}
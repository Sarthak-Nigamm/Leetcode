import java.util.*; 
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n =matrix.length;
        int m = matrix[0].length;
        int rs = 0;
        int cs = 0;
        int ce=m-1;
        int re = n-1;
        while(rs<=re && cs<=ce){
            //top
            for(int j = cs;j<=ce;j++){
                list.add(matrix[rs][j]);
            }
            rs++;
            //right
            for(int i=rs;i<=re;i++){
                list.add(matrix[i][ce]);
            }
            ce--;
            if(rs <= re){
            //bottom
            for(int j =ce;j>=cs;j--){
                list.add(matrix[re][j]);
            }
            re--;}
            if( cs <= ce){
            //left
            for(int i = re; i>=rs;i--){
                list.add(matrix[i][cs]);
            }cs++;}
           
        }
   return list;    }
}
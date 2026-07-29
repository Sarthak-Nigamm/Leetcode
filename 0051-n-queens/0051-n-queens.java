import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public boolean isSafe(char[][] board, int row, int col) {
        // Vertically
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        
        // Diagonally left 
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        // Diagonally right
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true; 
    }

    public void nQueens(char[][] board, int row, List<List<String>> allBoards) {
        //base
        if(row == board.length) {
            allBoards.add(constructBoard(board));
            return;
        }
        
        for(int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q'; 
                nQueens(board, row + 1, allBoards); 
                board[row][col] = '.'; 
            }
        }
    }
    
 
    private List<String> constructBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        nQueens(board, 0, allBoards);
        
        return allBoards;
    }
}
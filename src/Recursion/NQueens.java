package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
        List<List<String>> ans = new ArrayList<>();
        public List<List<String>> solveNQueens(int n) {
            char[][] board = new char[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    board[i][j] = '.';
                }
            }
            solve(board, 0 , n);
            return ans;
        }

        public void solve(char[][] board , int col , int n){
            if(col == n){
                ans.add(construct(board));
                return;
            }
            for(int row = 0; row < n; row++){
                if(isSafe(board , row , col)){
                    board[row][col] = 'Q';
                    solve(board , col + 1, n);
                    board[row][col] = '.';
                }
            }
        }
        public boolean isSafe(char[][] board , int row , int col){
            //row check
            for(int j = 0; j < col; j++){
                if(board[row][j] == 'Q') return false;

            }
            // for left diagonal
            for(int i = row , j = col ; i >= 0 && j >= 0; i--, j--){
                if(board[i][j] == 'Q') return false;
            }
            // for righ diagonal
            for(int i = row , j = col; i < board.length && j >= 0; i++, j--){
                if(board[i][j] == 'Q') return false;
            }
            return true;
        }
        public List<String> construct(char[][] board){
            List<String> res = new ArrayList<>();
            for(int i = 0; i < board.length; i++){
                res.add(new String(board[i]));
            }
            return res;
        }
        public static void main(String[] args) {

        }
}



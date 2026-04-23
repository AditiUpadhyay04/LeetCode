package Recursion;

public class GenerateParentheses {
    class Solution {
        List<String> s = new ArrayList<>();
        public void solve(int open , int close , String curr){
            if(open == 0 && close == 0){
                s.add(curr);
                return;
            }
            if(open != 0){
                solve(open - 1 , close , curr + "(");

            }
            if(close > open){
                solve(open , close - 1 , curr + ")");
            }
        }
        public List<String> generateParenthesis(int n) {
            int open = n;
            int close = n;
            solve(open , close , "");
            return s;

        }
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

        List<String> ans = new ArrayList<>();
        public void solve(String s , int index , String curr){
            if(index == s.length()){
                ans.add(curr);
                return;
            }
            char ch = s.charAt(index);
            if(ch >= 48 && ch <= 57){
                solve(s , index + 1, curr + ch);
            }
            else{
                solve(s , index + 1 , curr + Character.toLowerCase(ch));
                solve(s , index + 1, curr + Character.toUpperCase(ch));
            }
        }
        public List<String> letterCasePermutation(String s) {
            solve(s , 0, "");
            return ans;

        }

    public static void main(String[] args) {

    }
}


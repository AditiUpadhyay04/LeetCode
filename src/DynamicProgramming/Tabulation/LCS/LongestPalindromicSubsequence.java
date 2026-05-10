package DynamicProgramming.Tabulation.LCS;

public class LongestPalindromicSubsequence {
        public int lcs(String s1 , String s2){
            int n = s1.length();
            int m = s2.length();

            int[][] t = new int[n + 1][m + 1];

            for(int i =1; i <= n ; i++){
                for(int j = 1; j <= m ; j++){
                    if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                        t[i][j] = 1 + t[i - 1][j - 1];
                    }
                    else{
                        t[i][j] = Math.max(t[i - 1][j] , t[i][j - 1]);
                    }
                }
            }
            return t[n][m];
        }
        public int longestPalindromeSubseq(String s) {
            StringBuilder sb = new StringBuilder(s);

            String rev = sb.reverse().toString();
            return lcs(s , rev);

        }

    public static void main(String[] args) {

    }
}


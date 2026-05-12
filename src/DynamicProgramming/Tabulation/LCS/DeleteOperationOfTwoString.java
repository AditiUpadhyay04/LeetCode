package DynamicProgramming.Tabulation.LCS;

public class DeleteOperationOfTwoString {
        public int minDistance(String word1, String word2) {
            int n = word1.length();
            int m = word2.length();
            int[][] t = new int[n + 1][m + 1];

            for(int i = 1; i < n + 1; i++){
                for(int j = 1; j < m + 1; j++){
                    if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                        t[i][j] = 1 + t[i - 1][j - 1];
                    }
                    else{
                        t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                    }
                }
            }
            int lcs = t[n][m];

            int res = (n - lcs) + (m - lcs);
            return res;
        }

    public static void main(String[] args) {

    }
}



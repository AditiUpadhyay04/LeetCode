package Array;

public class FInd_The_Town_Judge {
        public int findJudge(int n, int[][] trust) {
            int[] yess = new int[n + 1];
            int[] noo = new int[n + 1];

            for(int i = 0; i < trust.length; i++){
                yess[trust[i][1]]++;
                noo[trust[i][0]]++;
            }
            for(int i = 1; i <= n; i++){
                if(yess[i] == n - 1 && noo[i] == 0){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {

    }
}



package GFG.MCM;

public class Matrix_Chain_Multiplication {
        static int solve(int arr[] , int i , int j , int[][] t) {

            if(i >= j) return 0;
            int mini = Integer.MAX_VALUE;

            if(t[i][j] != -1) return t[i][j];

            for(int k= i;k < j; k++){
                int temp = solve(arr,i,k,t) + solve(arr,k + 1, j,t) + (arr[i-1] * arr[k] * arr[j]);
                mini = Math.min(mini,temp);
            }
            return t[i][j] = mini;
        }
        static int matrixMultiplication(int arr[]) {
            // code here
            int n = arr.length;

            int[][] t = new int[n + 1][n + 1];

            for(int i = 0; i < n + 1; i++){
                for(int j = 0; j < n + 1; j++){
                    t[i][j] = -1;
                }
            }
            return solve(arr , 1 ,  n - 1 , t);


        }

    public static void main(String[] args) {

    }
}


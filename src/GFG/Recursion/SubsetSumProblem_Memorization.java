package GFG.Recursion;

public class SubsetSumProblem_Memorization {
        static Boolean solve(int[] arr , int n , int sum , Boolean[][] t){
            if(n == 0) return false;
            if(sum == 0) return true;

            if(t[n][sum] != null) return t[n][sum];
            if(arr[n - 1] <= sum){
                boolean include = solve(arr , n - 1 , sum - arr[n - 1] , t);
                boolean exclude = solve(arr , n - 1 , sum , t);
                t[n][sum] = include || exclude;
            }
            else{
                t[n][sum] = solve(arr , n - 1 , sum ,t);
            }
            return t[n][sum];
        }
        static Boolean isSubsetSum(int arr[], int sum) {

            int n = arr.length;
            Boolean[][] t = new Boolean[n + 1][sum + 1];

            return solve(arr , n , sum , t);
        }

    public static void main(String[] args) {

    }
}


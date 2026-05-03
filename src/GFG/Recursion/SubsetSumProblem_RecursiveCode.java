package GFG.Recursion;

public class SubsetSumProblem_RecursiveCode {
        static Boolean solve(int[] arr , int n , int sum){
            if(sum == 0) return true;

            if(n == 0) return false;

            if(arr[n - 1] <= sum){
                boolean include = solve(arr , n - 1 , sum - arr[n - 1]);
                boolean exclude = solve(arr , n - 1 , sum);
                return include || exclude;
            }
            else{
                return solve(arr , n - 1 , sum);
            }
        }
        static Boolean isSubsetSum(int arr[], int sum) {
            int n = arr.length;

            return solve(arr , n , sum);
        }

    public static void main(String[] args) {

    }
}

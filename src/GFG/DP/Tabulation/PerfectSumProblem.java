package GFG.DP.Tabulation;

public class PerfectSumProblem {
        // Function to calculate the number of subsets with a given sum
        public int perfectSum(int[] nums, int target) {
            // code here
            int n = nums.length;
            int sum = target;
            int[][] t = new int[n + 1][target + 1];

            for(int j = 0; j < sum + 1; j++){
                t[0][j] = 0;

            }
            for(int i = 0; i < n + 1; i++){
                t[i][0] = 1;
            }
            for(int i = 1; i < n + 1; i++){
                for(int j = 0; j < sum + 1; j++){
                    if(nums[i - 1] <= j){
                        t[i][j] = t[i - 1][j- nums[i - 1]] + t[i - 1][j];
                    }
                    else{
                        t[i][j] = t[i - 1][j];
                    }
                }
            }
            return t[n][sum];
        }

    public static void main(String[] args) {

    }
}


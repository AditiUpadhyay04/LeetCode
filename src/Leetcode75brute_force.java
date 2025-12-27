public class Leetcode75brute_force {

        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int maxSum = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum = 0;
                for(int j = i; j < n; j++){

                    sum += nums[j];
                    maxSum = Math.max(maxSum,sum);
                }

            }
            return maxSum;

        }

    public static void main(String[] args) {

    }

    }




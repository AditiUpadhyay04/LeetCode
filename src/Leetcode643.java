public class Leetcode643 {

        public double findMaxAverage(int[] nums, int k) {
            int n = nums.length;
            double sum = 0;
            int i = 0;
            int j = 0;

            double max = Double.NEGATIVE_INFINITY;

            while(j < n){
                sum += nums[j];
                if(j - i + 1 < k){
                    j++;
                }
                else if(j - i + 1 == k){
                    max = Math.max(max, sum/k);
                    sum -= nums[i];
                    i++;
                    j++;
                }
            }
            return max;

        }

    public static void main(String[] args) {

    }
}


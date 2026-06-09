package Array;

public class MaximumTotalSubArrayValueI {

        public long maxTotalValue(int[] nums, int k) {
            Long maxNum = Long.MIN_VALUE;
            Long minNum = Long.MAX_VALUE;

            for(int i = 0; i < nums.length; i++){
                maxNum = Math.max(maxNum , nums[i]);
                minNum = Math.min(minNum , nums[i]);
            }
            long value = maxNum - minNum;
            long total = value * k;

            return total;
        }

    public static void main(String[] args) {

    }
}


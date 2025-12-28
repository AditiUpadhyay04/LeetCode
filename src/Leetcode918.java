public class Leetcode918 {
        public int maxSubarraySumCircular(int[] nums) {
            int n = nums.length;
            int total = 0;
            int currMax = 0;
            int currMin = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                total += nums[i];

                currMax = Math.max(currMax + nums[i] , nums[i]);
                currMin = Math.min(currMin + nums[i] , nums[i]);

                max = Math.max(max, currMax);
                min = Math.min(min, currMin);

            }

            int circularMax = total - min;

            if(max < 0)
                return max;
            else
                return Math.max(circularMax, max);

        }

    public static void main(String[] args) {

    }
    }


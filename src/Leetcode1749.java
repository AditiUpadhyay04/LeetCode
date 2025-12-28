public class Leetcode1749 {
        public int maxAbsoluteSum(int[] nums) {
            int n = nums.length;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            int currMin = 0;
            int currMax = 0;

            for (int i = 0; i < n; i++) {

                currMax = Math.max(currMax + nums[i], nums[i]);
                currMin = Math.min(currMin + nums[i], nums[i]);

                max = Math.max(max, currMax);
                min = Math.min(min, currMin);
            }
            min = Math.abs(min);
            return Math.max(min, max);


        }

    public static void main(String[] args) {

    }

    }



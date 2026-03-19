package Array;

public class LongestContinousIncreasingSubsequence {

        public int findLengthOfLCIS(int[] nums) {

            int n  = nums.length;
            int currCount = 1;
            int maxii = 1;

            for(int i = 1; i < n; i++){
                if(nums[i] > nums[i - 1]){
                    currCount++;
                }else{
                    currCount = 1;


                }
                maxii = Math.max(maxii , currCount);
            }

            return maxii;

        }

    public static void main(String[] args) {

    }
}


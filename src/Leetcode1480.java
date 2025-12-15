public class Leetcode1480 {

        public int[] runningSum(int[] nums) {
            for(int i = 1; i < nums.length; i++){
                nums[i] = nums[i] +  nums[i - 1];
            }

            return nums;

        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Leetcode1480 L1 = new Leetcode1480();
        L1.runningSum(arr);
    }
    }


public class Leetcode2353 {
        public int differenceOfSum(int[] nums) {

            int elementSum = 0;
            int digitSum = 0;

            for(int i = 0; i < nums.length; i++){
                int value = nums[i];
                elementSum += value;

                while(value > 0){
                    digitSum += value% 10;
                    value =value / 10;
                }
            }
            int res = elementSum - digitSum;

            return res;
        }

    public static void main(String[] args) {

        }
}


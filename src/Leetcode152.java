public class Leetcode152 {

        public int maxProduct(int[] nums) {
            int n = nums.length;
            int currMax = nums[0];
            int currMin = nums[0];
            int max = nums[0];

            for(int i = 1; i < n; i++){

                if(nums[i] < 0){
                    int temp =currMax;
                    currMax = currMin;
                    currMin = temp;

                }

                currMax = Math.max(nums[i] , currMax * nums[i]);
                currMin = Math.min(nums[i] , currMin * nums[i]);


                max = Math.max(max , currMax);

            }
            System.out.println(max);
            return max;

        }

    public static void main(String[] args) {
            int[] nums = {2,3,-2,4};
            Leetcode152 l1 = new Leetcode152();
            l1.maxProduct(nums);

    }
    }



public class LeetCode169 {

        public int majorityElement(int[] nums) {
            int count = 0;
            int val = 0;

            for(int i = 0 ; i < nums.length ; i++){
                if(count == 0){
                    val = nums[i];

                }
                if(nums[i] == val)
                    count++;

                else
                    count--;

            }
            System.out.println(val);
            return val;
        }

    public static void main(String[] args) {
            int [] arr = {3,2,2,2,3,3};
        LeetCode169 L1 = new LeetCode169();
        L1.majorityElement(arr);

    }

}


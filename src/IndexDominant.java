public class IndexDominant {

        public int dominantIndex(int[] nums) {

            int max = 0;
            int maxIndex = 0;
            boolean flag = true;


            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    maxIndex = i;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (i != maxIndex) {
                    if (max < 2 * nums[i]) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                return maxIndex;
            }

            return -1;
        }

    public static void main(String[] args) {
           int [] arr = {3,6,1,0};
           IndexDominant I1 = new IndexDominant();
           I1.dominantIndex(arr);
    }
    }



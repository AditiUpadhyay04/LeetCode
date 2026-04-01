package Array;

public class Maxi_Count_Of_Pos_Neg {
        public int maximumCount(int[] nums) {
            int n = nums.length;
            int N = 0;
            int P = 0;
            int maxii = 0;
            for(int i = 0; i < n; i++){
                if(nums[i] > 0){
                    P++;
                }
                else if(nums[i] < 0){
                    N++;
                }
                else{
                    continue;
                }

            }
            maxii = Math.max(P , N);
            return maxii;

        }

    public static void main(String[] args) {

    }
}


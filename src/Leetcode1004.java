public class Leetcode1004 {
        public int longestOnes(int[] nums, int k) {
            int n = nums.length;
            int i = 0;
            int j = 0;
            int zero = 0;
            int maxx = 0;
            while( j < n){
                if(nums[j] == 0)
                    zero++;
                if(zero <= k){
                    maxx = Math.max(maxx, j - i + 1);
                    j++;
                }
                else{
                    while(zero > k){
                        if(nums[i] == 0)
                            zero--;
                        i++;
                    }
                    maxx = Math.max(maxx , j - i + 1);
                    j++;
                }
            }
            return maxx;

        }

    public static void main(String[] args) {

    }
}


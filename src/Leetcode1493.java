public class Leetcode1493 {
        public int longestSubarray(int[] nums) {

            int n = nums.length;
            int i = 0;
            int j = 0;
            int zero = 0;
            int maxx = 0;
            int k = 1;

            while( j < n){
                if(nums[j] == 0)
                    zero++;
                if(zero <= k){
                    maxx = Math.max(maxx, j - i );
                    j++;
                }
                else{
                    while(zero > k){
                        if(nums[i] == 0)
                            zero--;
                        i++;
                    }
                    maxx = Math.max(maxx , j - i );
                    j++;
                }
            }
            return maxx;

        }


    public static void main(String[] args) {
   }
}





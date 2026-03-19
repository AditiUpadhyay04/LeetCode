package Array;

import java.util.HashMap;

public class TwoSum_1 {

        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];

            HashMap<Integer,Integer> mpp = new HashMap<>();

            int n = nums.length;
            ans[0] = -1;
            ans[1] = -1;

            for(int i = 0; i < n; i++){
                int rem = target - nums[i];
                if(mpp.containsKey(rem)){
                    ans[0] = i;
                    ans[1] = mpp.get(rem);
                    break;
                }
                mpp.put(nums[i] , i);
            }
            return ans;

        }

    public static void main(String[] args) {

    }
}


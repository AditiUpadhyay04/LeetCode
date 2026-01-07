package HashMapp;

import java.util.HashMap;
public class TwoSumHashMap {

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        HashMap<Integer,Integer> mpp = new HashMap<>();

        int n = nums.length;
        ans[0] = -1;
        ans[1] = -1;

        for(int i = 0; i < n; i++){
            mpp.put(nums[i] , i);
        }
        for(int i = 0; i < n; i++){
            int rem = target - nums[i];
            if(mpp.containsKey(rem) && mpp.get(rem) != i){
                ans[0] = i;
                ans[1] = mpp.get(rem);
                break;
            }
        }
        return ans;

    }

    public static void main(String[] args) {

    }
}


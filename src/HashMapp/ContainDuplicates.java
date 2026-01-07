package HashMapp;

import java.util.HashMap;

public class ContainDuplicates {

        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer,Integer> HM = new HashMap<>();

            int n = nums.length;
            for(int i = 0; i < n; i++)
            {


                if(HM.containsKey(nums[i]))
                {
                    return true;
                }
                HM.put(nums[i], 1);
            }

            return false;
        }

    public static void main(String[] args) {

    }
}

package HashMapp;
import java.util.HashMap;
import java.util.HashSet;

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

    /*HashSet <Integer> set = new HashSet<>();
    int n = nums.length;

        for(int i = 0; i < n; i++){

        if(set.contains(nums[i])){
            return true;
        }
        set.add(nums[i]);
    }
        return false;

     */

    public static void main(String[] args) {

    }
}

package HashMapp;

import java.util.HashMap;

public class Leetcode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> H1 = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(H1.containsKey(nums[i])){
                if(Math.abs(i-H1.get(nums[i])) <= k){
                    return true;
                }
            }
            H1.put(nums[i] , i);
        }
        return false;
    }
    public static void main(String[] args) {

    }
}

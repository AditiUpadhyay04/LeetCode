package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
        public void solve(int[] nums , int idx , List<List<Integer>> ans){
            if(idx == nums.length){
                List<Integer> list = new ArrayList<>();
                for(int i : nums){
                    list.add(i);
                }
                ans.add(list);
                return;
            }

            for(int i = idx ; i <nums.length; i++){
                swap(nums , idx , i);
                solve(nums , idx + 1 , ans);
                swap(nums , idx , i);
            }
        }

        public void swap(int[] nums, int i , int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            solve(nums , 0 , ans);
            return ans;

        }

    public static void main(String[] args) {

    }
}


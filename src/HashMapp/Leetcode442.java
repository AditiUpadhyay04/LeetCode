package HashMapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode442 {
        public List<Integer> findDuplicates(int[] nums) {
            HashSet<Integer> S1 = new HashSet<>();
            ArrayList<Integer> a1 = new ArrayList<>();
            int n = nums.length;

            for(int i = 0 ; i < n; i++){
                if(S1.contains(nums[i])){
                    a1.add(nums[i]);
                }
                S1.add(nums[i]);
            }
            return a1;

        }

    public static void main(String[] args) {
        }
    }


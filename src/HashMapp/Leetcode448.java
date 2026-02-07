package HashMapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode448 {

        public List<Integer> findDisappearedNumbers(int[] nums) {
            HashSet<Integer> S1 = new HashSet<>();
            ArrayList<Integer> a1 = new ArrayList<>();
            int n = nums.length;

            for(int i = 0; i < n; i++){
                S1.add(nums[i]);

            }
            for(int i = 1 ; i <= n; i++){
                if(!S1.contains(i)){
                    a1.add(i);
                }
            }
            return a1;

        }


public static void main(String[] args) {

      }
  }

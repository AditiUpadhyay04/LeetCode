package HashMapp;

import java.util.HashSet;
public class Leetcode349 {

        public int[] intersection(int[] nums1, int[] nums2){

            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> res = new HashSet<>();

            int n = nums1.length;
            int m = nums2.length;

            for(int i = 0; i < n; i++){
                set.add(nums1[i]);
            }

            for(int i = 0; i < m; i++){
                if(set.contains(nums2[i])){
                    res.add(nums2[i]);
                }
            }
            int size = res.size();
            int[] ans = new int[size];
            int idx = 0;

            for(Integer num : res){
                ans[idx] = num;
                idx++;
            }
            return ans;


        }

    public static void main(String[] args) {

    }
}


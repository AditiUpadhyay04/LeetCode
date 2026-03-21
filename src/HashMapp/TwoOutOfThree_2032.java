package HashMapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree_2032 {
        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            HashSet<Integer> set1 = new HashSet<>();
            int n = nums1.length;
            int m = nums2.length;
            int p = nums3.length;

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(nums1[i] == nums2[j]){
                        set1.add(nums1[i]);
                    }
                }
                for(int k = 0; k < p; k++){
                    if(nums1[i] == nums3[k]){
                        set1.add(nums1[i]);
                    }
                }
            }

            for(int i = 0; i < m; i++){
                for(int j = 0; j < p; j++){
                    if(nums2[i] == nums3[j]){
                        set1.add(nums2[i]);
                    }
                }
            }

            return new ArrayList<>(set1);

        }

    public static void main(String[] args) {

    }
}


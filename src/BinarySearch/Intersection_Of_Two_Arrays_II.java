package BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_Of_Two_Arrays_II {

        public int[] intersect(int[] nums1, int[] nums2) {

            int n = nums1.length;
            int m = nums2.length;

            HashMap<Integer, Integer> h1 = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                h1.put(nums1[i] , h1.getOrDefault(nums1[i] , 0) + 1);
            }

            for(int i = 0; i < m; i++){
                if(h1.containsKey(nums2[i]) && h1.get(nums2[i]) > 0){
                    list.add(nums2[i]);
                    h1.put(nums2[i] , h1.get(nums2[i]) - 1);
                }
            }
            int size = list.size();
            int [] res = new int[size];
            for(int i = 0; i < size; i++){
                res[i] = list.get(i);
            }
            return res;
        }

    public static void main(String[] args) {

    }
}


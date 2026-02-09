package HashMapp;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode1207 {

        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer , Integer> HM = new HashMap<>();
            HashSet<Integer> S1 = new HashSet<>();
            int n = arr.length;

            for(int i = 0; i < n; i++){
                HM.put(arr[i] , HM.getOrDefault(arr[i] , 0) + 1);
            }
            for(int val : HM.values()){
                if(S1.contains(val)) return false;

                else S1.add(val);

            }

            return true;
        }

    public static void main(String[] args) {

    }

    }



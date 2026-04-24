package BinarySearch;

import java.util.HashSet;

public class FairCandySwap {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int n = aliceSizes.length;
            int m = bobSizes.length;

            int sum1 = 0;
            int sum2 = 0;

            for(int i = 0; i < n; i++){
                sum1 += aliceSizes[i];
            }
            for(int i = 0; i < m; i++){
                sum2 += bobSizes[i];
            }
            int diff = (sum1 - sum2)/2;

            HashSet<Integer> s1 = new HashSet<>();

            for(int i = 0; i <m; i++){
                s1.add(bobSizes[i]);
            }
            for(int i = 0; i < n; i++){
                int a = aliceSizes[i];
                int b = a - diff;

                if(s1.contains(b)){
                    return new int[]{a , b};
                }
            }
            return new int[0];

        }

    public static void main(String[] args) {

    }
}


package Sliding_Window;

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {
    //1838
        public int maxFrequency(int[] nums, int k) {
            Arrays.sort(nums);
            int i = 0;
            int j = 0;
            long sum = 0;
            int maxx = 0;

            while(i < nums.length){
                sum += nums[i];

                while(((long)nums[i] * (i - j + 1) - sum) > k){
                    sum -= nums[j];
                    j++;
                }
                maxx = Math.max(maxx , i - j + 1);
                i++;


            }
            return maxx;
        }

    public static void main(String[] args) {

    }
}


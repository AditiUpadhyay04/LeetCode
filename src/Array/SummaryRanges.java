package Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
        public List<String> summaryRanges(int[] nums) {
            List<String> ans = new ArrayList<>();

            for(int i = 0; i < nums.length; i++){
                int start = nums[i];

                while(i < nums.length - 1 && nums[i] + 1 == nums[i + 1]){
                    i++;
                }
                if(start == nums[i]){
                    ans.add("" + start);
                }
                else{
                    ans.add(start + "->" + nums[i]);

                }
            }
            return ans;

        }

    public static void main(String[] args) {

    }
}


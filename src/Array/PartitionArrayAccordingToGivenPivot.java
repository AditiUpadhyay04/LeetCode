package Array;

import java.util.ArrayList;

public class PartitionArrayAccordingToGivenPivot {
         int[] pivotArray(int[] nums, int pivot) {
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                if(nums[i] < pivot){
                    list1.add(nums[i]);
                }
                else if(nums[i] == pivot){
                    list2.add(nums[i]);
                }
                else{
                    list3.add(nums[i]);
                }
            }
                  
            ans.addAll(list1);
            ans.addAll(list2);
            ans.addAll(list3);

            int[] result = new int[ans.size()];
            for(int i = 0; i < ans.size(); i++){
                result[i] = ans.get(i);
            }
            return result;
        }

    public static void main(String[] args) {

    }
}


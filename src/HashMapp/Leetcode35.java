package HashMapp;

public class Leetcode35 {

        public int searchInsert(int[] nums, int target) {
            int end = nums.length - 1;
            int start = 0;

            while(start <= end){
                int mid = (start + end) / 2;

                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            return start;
        }

    public static void main(String[] args) {

    }
}




package BinarySearch;

public class Search_in_rotated_sorted_array {
    public int search(int[] nums, int target) {
            int n = nums.length;
            int low = 0;
            int high = n - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;
                //left part is sorted
                if(nums[mid] == target) return mid;
                if(nums[low] <= nums[mid]){
                    if( target >= nums[low]  && target <= nums[mid])
                    {
                        high = mid - 1;
                    }
                    else{
                        low = mid + 1;
                    }
                }

                else{
                    if(target <= nums[high] && target >= nums[mid])
                    {
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }
            return -1;
        }
        public static void main(String[] args) {

    }
}

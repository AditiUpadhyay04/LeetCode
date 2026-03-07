package BinarySearch;

public class Search_in_rotated_sorted_array_II {
        public boolean search(int[] nums, int target) {
            int n = nums.length;
            int low = 0;
            int high = n - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;
                //left part is sorted
                if(nums[mid] == target) return true;

                if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                    low++;
                    high--;
                    continue;
                }
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
                    //righ part is sorted
                    if(target <= nums[high] && target >= nums[mid])
                    {
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }
            return false;

        }

    public static void main(String[] args) {

    }
}



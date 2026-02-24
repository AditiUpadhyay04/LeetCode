package BinarySearch;

public class First_Last_Occurence_34 {

        public int first(int[] nums, int target){
            int n = nums.length;
            int low = 0;
            int high = n - 1;
            int ans = -1;

            while(low <= high){
                int mid = low + (high -low)/2;
                if(target == nums[mid]){
                    ans = mid;
                    high = mid - 1;


                }
                else if(target > nums[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            return ans;
        }


        public int last(int[] nums, int target){
            int n = nums.length;
            int low = 0;
            int high = n - 1;
            int ans = -1;

            while(low <= high){
                int mid = low + (high -low)/2;
                if(target == nums[mid]){
                    ans = mid;
                    low = mid + 1;

                }
                else if(target > nums[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;

                }

            }
            return ans;
        }


        public int[] searchRange(int[] nums, int target) {
            int n = nums.length;
            int[]res = new int[2];
            res[0] = first(nums,target);
            res[1] = last(nums,target);

            return res;
        }
        public static void main(String[] args) {

  }
}

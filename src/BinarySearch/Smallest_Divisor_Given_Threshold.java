package BinarySearch;

public class Smallest_Divisor_Given_Threshold {
        public int maxElement(int[] nums){
            int n = nums.length;
            int maxx = 0;
            for(int i = 0; i < n; i++){
                if(maxx <= nums[i]){
                    maxx = nums[i];
                }
            }
            return maxx;
        }
        public boolean isPossible(int[] nums , int threshold , int mid){
            int n = nums.length;
            int sum = 0;

            for(int i = 0; i < n; i++){
                sum += Math.ceil((double) nums[i] / mid);
            }
            if(sum <= threshold){
                return true;
            }
            else{
                return false;
            }
        }
        public int smallestDivisor(int[] nums, int threshold) {
            int n = nums.length;
            int low = 1;
            int high = maxElement(nums);

            while(low <= high){
                int mid = low + ( high - low) / 2;
                if(isPossible(nums , threshold , mid)){
                    high = mid - 1;

                }
                else{
                    low = mid + 1;
                }
            }
            return low;

        }

    public static void main(String[] args) {

    }
}


package BinarySearch;

public class Sqrt_69 {

        public int mySqrt(int x) {
            int low = 1;
            int high = x;
            int ans = 0;

            while(low <= high){

                int mid = low + (high - low) / 2;
                if(mid * mid == x){
                    return mid;

                }
                else if( mid <= x/mid){
                    ans = mid;
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            return ans;

        }

    public static void main(String[] args) {

    }
}


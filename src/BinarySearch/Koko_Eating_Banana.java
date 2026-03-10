package BinarySearch;

public class Koko_Eating_Banana {

        public int maximum(int[] piles){
            int n = piles.length;
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++){
                max = Math.max(max, piles[i]);
            }

            return max;

        }
        public int calculate(int[] piles , int mid){
            int n = piles.length;
            int hour = 0;

            for(int i = 0; i < n; i++){
                hour += Math.ceil((double) piles[i] / mid);
            }
            return hour;
        }
        public int minEatingSpeed(int[] piles, int h) {
            int low = 1;
            int high = maximum(piles);
            int ans = -1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                int hours = calculate(piles , mid);

                if(hours <= h){
                    ans = mid;
                    high = mid - 1;

                }
                else{
                    low = mid + 1;
                }

            }
            return ans;

        }

    public static void main(String[] args) {

    }
}

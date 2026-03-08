package BinarySearch;

public class Capacity_To_SHip_Packages_Within_D_Days {
        public int maxElement(int[] weights){
            int n = weights.length;
            int maxx = weights[0];
            for(int i = 0; i < n; i++){
                if(weights[i] > maxx){
                    maxx = weights[i];
                }

            }
            return maxx;

        }
        public int sumOfElement(int[] weights){
            int n = weights.length;
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += weights[i];
            }
            return sum;
        }
        public int isPossible(int[] weights , int mid){
            int n = weights.length;
            int day = 1;
            int sum = 0;

            for(int i = 0; i < n; i++){
                if(sum + weights[i] > mid){

                    day++;
                    sum = weights[i];
                }
                else{

                    sum += weights[i];
                }
            }
            return day;

        }

        public int shipWithinDays(int[] weights, int days) {
            int low = maxElement(weights);
            int high = sumOfElement(weights);


            while(low <= high){
                int mid = low + (high - low) / 2;

                if(isPossible(weights , mid) <= days){

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



package BinarySearch;

public class Minimum_Number_Days_To_Make_Bouquet {

        public int minimum(int[] bloomDay){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < bloomDay.length; i++){
                if(bloomDay[i] < min){
                    min = bloomDay[i];
                }
            }
            return min;
        }

        public int maximum(int[] bloomDay){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < bloomDay.length; i++){
                if(bloomDay[i] > max){
                    max = bloomDay[i];
                }
            }
            return max;
        }

        public boolean isPossible(int[] bloomDay , int m, int k, int mid){
            int count = 0;
            int boq = 0;

            for(int i = 0; i < bloomDay.length; i++){
                if(mid >= bloomDay[i]){
                    count++;
                }
                else{
                    boq += count / k;
                    count = 0;
                }
            }

            boq += count / k;

            return boq >= m;
        }

        public int minDays(int[] bloomDay, int m, int k) {
            int n = bloomDay.length;

            if((long)m * k > n) return -1;

            int low = minimum(bloomDay);
            int high = maximum(bloomDay);
            int ans = -1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(isPossible(bloomDay , m , k , mid)){
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



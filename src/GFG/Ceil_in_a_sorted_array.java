package GFG;

public class Ceil_in_a_sorted_array {

        public int findCeil(int[] arr, int x) {

            int n = arr.length;
            int low = 0;
            int high = n - 1;
            int res = -1;
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(arr[mid] == x){
                    res = mid;
                    high = mid - 1;
                }

                else if(arr[mid] > x){
                    res = mid;
                    high = mid - 1;


                }
                else{
                    low = mid + 1;
                }

            }
            return res;

        }

    public static void main(String[] args) {

    }
}



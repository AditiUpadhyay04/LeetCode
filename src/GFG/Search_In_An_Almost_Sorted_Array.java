package GFG;

public class Search_In_An_Almost_Sorted_Array {

        public int findTarget(int arr[], int target) {

            int n = arr.length;
            int low = 0;
            int high = n - 1;

            while(low <= high){
                int mid = low + (high - low)/ 2;


                if(arr[mid] == target) return mid;

                if( mid > 0 && arr[mid - 1] == target) return mid - 1;
                if(mid < n -1 &&  arr[mid + 1] == target) return mid + 1;

                else if(target > arr[mid])   low = mid + 1;

                else high = mid - 1;
            }
            return -1;
        }

    public static void main(String[] args) {

    }
}


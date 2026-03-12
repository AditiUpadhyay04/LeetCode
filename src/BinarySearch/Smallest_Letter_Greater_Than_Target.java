package BinarySearch;

public class Smallest_Letter_Greater_Than_Target {
        public char nextGreatestLetter(char[] letters, char target) {
            int n = letters.length;
            int low = 0;
            int high = n - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(letters[mid] > target){
                    high = mid - 1;

                }
                else{
                    low = mid + 1;
                }
            }
            if(low == n){
                return letters[0];
            }
            return letters[low];

        }

    public static void main(String[] args) {

    }
}


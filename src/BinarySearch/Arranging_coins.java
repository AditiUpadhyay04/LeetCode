package BinarySearch;

public class Arranging_coins {
        public int arrangeCoins(int n) {
            int row = 1;
            int count = 0;

            while(row <= n){
                n = n - row;
                row++;
                count++;
            }
            return count;

        }

    public static void main(String[] args) {

    }
}


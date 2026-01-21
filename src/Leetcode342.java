public class Leetcode342 {

        public boolean isPowerOfFour(int n) {
            if (n <= 0)
                return false;

            while(n % 4 == 0){
                n = n/ 4;
            }
            if(n == 1)
                return true;
            else
                return false;
        }

    public static void main(String[] args) {
     Leetcode342 l1 = new Leetcode342();

    }
}


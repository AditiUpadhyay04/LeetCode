public class Leetcode1304 {

        public int[] sumZero(int n) {
            int[] arr = new int[n];
            int i = 0;
            int j = n - 1;
            int num = 1;

            while(i < j){
                arr[i] = num;
                arr[j] = -num;
                i++;
                j--;
                num++;

            }

            return arr;


        }

    public static void main(String[] args) {
        int n = 5;
        Leetcode1304 l1 = new Leetcode1304();
        l1.sumZero(n);
    }
    }


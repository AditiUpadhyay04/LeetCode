public class Leetcode1343 {

        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int n = arr.length;
            int i = 0;
            int j = 0;
            int sum = 0;
            int max = 0;
            int count = 0;

            while(j < n){
                sum += arr[j];

                if(j - i + 1 < k)
                {
                    j++;
                }
                else if(j - i + 1 == k)
                {
                    max =sum/k;
                    if(max >= threshold){
                        count++;
                    }
                    sum -= arr[i];
                    i++;
                    j++;
                }
            }

            return count;
        }

    public static void main(String[] args) {

    }
}



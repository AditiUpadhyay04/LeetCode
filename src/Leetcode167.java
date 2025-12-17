public class Leetcode167 {
        public int[] twoSum(int[] numbers, int target) {
            int [] res = new int[2];
            int i = 0;
            int j = numbers.length - 1;

            while(i < j){
                int sum =  numbers[i] + numbers[j];

                if(sum == target){
                    res[0] = i + 1;
                    res[1] = j + 1;
                    break;
                }
                else if(sum > target){
                    j--;
                }
                else
                    i++;
            }

            return res;
        }

    public static void main(String[] args) {
        int[] arr = {2,7,9,20};
        int target = 9;
        Leetcode167 l1 = new Leetcode167();
        l1.twoSum(arr , target);

    }
    }


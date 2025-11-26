public class GoodPair {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]) {
                    count++;
                }

            }


        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        GoodPair GP = new GoodPair();
        GP.numIdenticalPairs(arr);

    }
}


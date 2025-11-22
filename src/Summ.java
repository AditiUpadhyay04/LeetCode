class Summ {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int num[] = {2,4,5,6};
        int target = 9;
        Summ obj = new Summ();

    }
}

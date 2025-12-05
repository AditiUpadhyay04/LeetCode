public class Sort {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int num = 0; // slow pointer

        for (int i = 1; i < nums.length; i++) { // fast pointer
            if (nums[i] != num) {
                num++;
                num = nums[i];
            }
        }
        //   return num + 1;
        System.out.println(num);
        return num + 1;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1};
        Sort s1 = new Sort();
        s1.removeDuplicates(arr);
    }
}



public class Leet189 {
    public void reverse( int[] nums , int i, int j ){
        int temp = 0;
        while (i < j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }


    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % 10;

        reverse(nums , 0 , n - 1);
        reverse(nums , 0 , k - 1);
        reverse(nums , k , n - 1);


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Leet189 l1 = new Leet189();

    }
}


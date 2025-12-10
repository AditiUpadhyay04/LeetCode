public class sortParity {
    public int[] sortArrayByParity(int[] nums) {
    int n = nums.length;
    int i = 0;

    for(int j = 0;j < n; j++){
        if(nums[j] % 2 == 0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
    }

    return nums;


   }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        sortParity s1 = new sortParity();
        s1.sortArrayByParity(arr);
    }
}

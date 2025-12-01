public class MoveZero {

        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int index = 0;
            for(int i = 0; i < n; i++){
                if(nums[i] != 0){
                    nums[index] = nums[i];
                    index++;
                }
            }
            while(index < n){
                nums[index] = 0;
                index++;
            }


        }

    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        MoveZero m1 = new MoveZero();
        m1.moveZeroes(arr);
    }
}


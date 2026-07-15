package Array;

public class MonotonicArray {
        public boolean isMonotonic(int[] nums) {

            boolean monoInc = true;
            boolean monoDec = true;

            for(int i = 0; i < nums.length; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] > nums[j]) {
                        monoInc = false;
                        break;
                    }

                    else if(nums[i] < nums[j]){
                        monoDec = false;
                        break;
                    }

                }

            }
            return monoInc || monoDec;

        }

    public static void main(String[] args) {

    }
}


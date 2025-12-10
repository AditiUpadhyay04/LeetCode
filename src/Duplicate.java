import java.util.Arrays;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        Duplicate d1 = new Duplicate();
        d1.containsDuplicate(arr);
    }
}


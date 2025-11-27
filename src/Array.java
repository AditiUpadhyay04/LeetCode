import java.util.Arrays;

public class Array {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;


    }

    public static void main(String[] args) {
        int[] num = {1,2,1};
        Array a1 = new Array();
        a1.getConcatenation(num);
    }
}


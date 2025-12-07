public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        for(int j = 0; j < n; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(i);
        return i;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        RemoveElement r1 = new RemoveElement();
        r1.removeElement(arr,val);
    }
}


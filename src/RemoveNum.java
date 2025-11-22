import java.util.ArrayList;

class RemoveNum {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val){
                arr.add(nums[i]);
            }
        }
        int result = arr.size();

        for(int i = 0; i < arr.size(); i++){
            nums[i] = arr.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int array[] = {3,3,2};
        RemoveNum obj = new RemoveNum();
         int n = obj.removeElement(array,2);

    }
}

import java.util.ArrayList;

class Summ {
    public int[] twoSum(int[] nums, int target)
    {   int[] ress;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0; i < 2;i++){
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < nums.length; i++)
        {

            for (int j = i + 1; j < nums.length; j++)
            {
                boolean flag = true;
                if (nums[i] + nums[j] == target)
                {
                    if(flag) {
                        res.get(0).add(i);
                        res.get(0).add(j);
                        flag = false;
                    }
                    else{
                        res.get(0).add(i);
                        res.get(0).add(j);
                    }
                    
                }
            }
        }
        System.out.println(res);
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] num = {2,4,5,4};
        int target = 9;
        Summ obj = new Summ();
        obj.twoSum(num,target);

    }
}

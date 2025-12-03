class SingleNum {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum^ nums[i];


        }
        System.out.println(sum);
        return sum;


    }

    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2};
        SingleNum s1 = new SingleNum();
        s1.singleNumber(arr);
    }

}






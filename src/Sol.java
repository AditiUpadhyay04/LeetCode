class Sol {
    public int missingNumber(int[] nums) {
        int TotalSum = 0;
        int res = 0;
        for(int i = 0; i <= nums.length; i++){
            TotalSum = TotalSum + i;

        }
        int Sum = 0;
        for(int i = 0; i < nums.length; i++){
            Sum = Sum + nums[i];
        }
        res = TotalSum - Sum;
        System.out.println(res);
        return (res);

    }

    public static void main(String[] args) {
        int[] arr = {0,2,3};
        Sol s1 = new Sol();
        s1.missingNumber(arr);
    }
}

class SquareSort {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = nums[i] * nums[i];
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(res[i] > res[j]){
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,-5,3,0};
        SquareSort s1 = new SquareSort();
        s1.sortedSquares(arr);
    }
}




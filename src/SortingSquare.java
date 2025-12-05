public class SortingSquare {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int pos = n - 1;
        int[] res = new int[n];

        while( i <= j ){
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];

            if(right >= left){
                res[pos] = right;
                j--;
            }
            else{
                res[pos] = left;
                i++;
            }
            pos--;


        }
        for(int m=0;m<n;m++)
        {
            System.out.println(res[m]);}



        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        SquareSort s1 = new SquareSort();
        s1.sortedSquares(arr);
    }
}




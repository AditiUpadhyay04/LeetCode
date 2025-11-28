public class EvenDigitCount {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int res = 0;
        int count = 0;
        for(int i =0; i< n; i++){
            int num = nums[i];
            count = 0;
            while(num != 0){
                count++;
                num = num / 10;
            }
            if(count % 2 == 0)
                res++;


        }
        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {98,84,765,3452};
        EvenDigitCount e1 = new EvenDigitCount();
        e1.findNumbers(arr);
    }
}


public  class ss {
     public int[] buildArray(int[] nums) {
         int n = nums.length;
         int[] ans = new int[n];


         for (int i = 0; i < n; i++) {
             ans[i] = nums[nums[i]];


         }
         System.out.println(ans);
         return ans;
     }
         public static void main (String[] args){
             int[] arr = {0, 2, 1, 5, 3, 4};
             ss s1 = new ss();
             s1.buildArray(arr);


     }
 }

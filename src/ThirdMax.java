public class ThirdMax {

        public int thirdMax(int[] nums) {
            int n = nums.length;
            long FirstMax = Long.MIN_VALUE;
            long SecondMax = Long.MIN_VALUE;
            long ThirdMax = Long.MIN_VALUE;

            for(int i = 0; i < n; i++){
                if(nums[i] == FirstMax || nums[i] == SecondMax || nums[i] == ThirdMax ){
                    continue;
                }
                if(nums[i] > FirstMax)

                {
                    ThirdMax = SecondMax;
                    SecondMax = FirstMax;
                    FirstMax = nums[i];
                }
                else if(nums[i] > SecondMax)
                {
                    ThirdMax = SecondMax;
                    SecondMax = nums[i];
                }
                else if(nums[i] > ThirdMax)
                {
                    ThirdMax = nums[i];
                }


            }
            if(ThirdMax == Long.MIN_VALUE)
            {
                return (int)FirstMax;
            }
            else{
                return (int)ThirdMax;
            }


        }

    public static void main(String[] args) {
        int [] arr = {3,2,1};
        ThirdMax m1 = new ThirdMax();
        m1.thirdMax(arr);
    }
    }


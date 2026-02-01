import java.util.Deque;
import java.util.LinkedList;

public class SLIDING_WINDOW_MAX_LEETCODE239 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int ans[] = new int[n - k + 1];
            Deque<Integer> dq = new LinkedList<>();
            int i = 0;
            int j = 0;

            while(j < n){
                while(!dq.isEmpty() && nums[dq.peekLast()] < nums[j]){
                    dq.pollLast();
                }
                dq.offerLast(j);

                if( j - i + 1 < k){
                    j++;
                }
                else if(j - i + 1 == k){
                    ans[i]  = nums[dq.peekFirst()];
                    if(dq.peekFirst() == i){
                        dq.pollFirst();
                    }
                    j++;
                    i++;
                }


            }
            return ans;
        }

    public static void main(String[] args) {

    }
}


package Stack;

import java.util.Stack;

public class Asteroid_Collision {

        public int[] asteroidCollision(int[] asteroids) {
            int n = asteroids.length;
            Stack<Integer> st = new Stack<>();

            for(int i = 0; i < n; i++){
                boolean isAlive = true;

                int a = asteroids[i];

                while(!st.isEmpty() && a < 0 && st.peek() > 0){
                    int p = st.peek();

                    if(p > -a){
                        isAlive = false;
                        break;
                    }
                    else if(p < -a){
                        st.pop();
                    }
                    else{
                        isAlive = false;
                        st.pop();
                        break;
                    }
                }
                if(isAlive) st.push(a);
            }
            int m = st.size();
            int[] ans = new int[m];

            for(int i = m - 1; i >= 0; i--){
                ans[i] = st.pop();
            }
            return ans;

        }

    public static void main(String[] args) {

    }
}


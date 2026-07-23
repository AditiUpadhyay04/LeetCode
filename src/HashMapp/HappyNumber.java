package HashMapp;

import java.util.HashSet;
public class HappyNumber {
        public boolean isHappy(int n) {
            HashSet<Integer> hs = new HashSet<>();

            while(n != 1){
                if(hs.contains(n)){
                    return false;
                }

                hs.add(n);
                int sum = 0;


                while(n > 0){
                    int num = n % 10;
                    sum += num * num;
                    n = n/10;
                }
                n = sum;
            }
            return true;

        }

    public static void main(String[] args) {

    }
}

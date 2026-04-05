public class Perfect_Number_507 {
        public boolean checkPerfectNumber(int num) {
            int sum = 1;
        /* if(num <= 0) return false;

            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    sum += i;
                }
            }
            if(sum == num){
                return true;
            }
            return false;
            */
            if(num <= 1) return false;

            for(int i = 2; i * i < num; i++){
                if(num % i == 0){
                    sum += i;

                    if(i != num / i){
                        sum += num / i;
                    }
                }
            }
            if(sum == num) return true;

            return false;
        }

    public static void main(String[] args) {

    }
}

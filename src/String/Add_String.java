package String;

public class Add_String {
        public String addStrings(String num1, String num2) {
            int n = num1.length();
            int m = num2.length();
            int i = n - 1;
            int j = m - 1;
            StringBuilder sb = new StringBuilder();
            int carr = 0;
            while(i >= 0 || j >= 0 || carr != 0){
                int d1 = 0;
                if(i >= 0){
                    d1 = num1.charAt(i) - '0';

                }
                int d2 = 0;
                if(j >= 0){
                    d2 = num2.charAt(j) - '0';
                }
                int sum = d1 + d2 + carr;

                sb.append(sum % 10);
                carr = sum / 10;

                i--;
                j--;
            }
            return sb.reverse().toString();


        }

    public static void main(String[] args) {

    }
}


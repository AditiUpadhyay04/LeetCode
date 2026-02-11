package String;

public class Valid_Palidrome_125 {
        public boolean isPalindrome(String s) {

            int n = s.length();
            s = s.toLowerCase();

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < n ; i++){
                char ch = s.charAt(i);

                if(( ch >= 'a' && ch <= 'z') || ( ch >= '0' && ch <= '9')){
                    sb.append(ch);
                }
            }
            n = sb.length();
            int i = 0;
            int j = n - 1;
            while(i < j){
                if(sb.charAt(i) != sb.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;

        }

    public static void main(String[] args) {

    }
}


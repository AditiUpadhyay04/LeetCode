package String;

public class Valid_Palindrome_II_680 {
        public boolean isValid(String s, int i , int j){
            while(i < j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;

            }
            return true;

        }

        public boolean validPalindrome(String s) {
            int n = s.length();
            int i = 0;
            int j = n - 1;

            while(i < j){
                if(s.charAt(i) == s.charAt(j)){
                    i++;
                    j--;
                }
                else{
                    return isValid(s, i + 1 , j) || isValid(s, i , j - 1);
                }
            }
            return true;


        }

    public static void main(String[] args) {

    }
}

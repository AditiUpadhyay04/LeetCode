public class StringReverse {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        boolean flag = true;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right) )
            {
                flag = false;
                break;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "Nitin";
        StringReverse SR = new StringReverse();
        SR.isPalindrome(s);
    }
}


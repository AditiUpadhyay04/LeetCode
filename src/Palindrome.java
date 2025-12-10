public class Palindrome {
public boolean isPalindrome(int x) {

    if (x < 0) return false;

    int original = x;
    int rev = 0;
    while(x > 0){
        int num2 = x % 10;
        x = x/10;
        rev = rev * 10 + num2  ;

    }
    System.out.println(original == rev);
    return original == rev;
}

    public static void main(String[] args) {
        int num = 232;
        Palindrome obj = new Palindrome();
        obj.isPalindrome(232);


    }
}
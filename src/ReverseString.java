public class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;


        }
        System.out.println(s);


    }

    public static void main(String[] args) {
        char[] s = {'h', 'e' ,'l' , 'l' , 'o'};
        ReverseString R1 = new ReverseString();
        R1.reverseString(s);
        System.out.println(s);
    }
}



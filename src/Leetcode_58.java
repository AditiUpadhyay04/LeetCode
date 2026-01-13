public class Leetcode_58 {
    public int lengthOfLastWord(String s) {
            s = s.trim();          // trim first
            int n = s.length();    // then get length
            int count = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ')
                    break;
                count++;
            }
            System.out.println(count);
            return count;
        }

    public static void main(String[] args) {
       String  s = "Hello Moonnnn ";
       Leetcode_58 L1 = new Leetcode_58();
       L1.lengthOfLastWord(s);
    }
}



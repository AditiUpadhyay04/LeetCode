package String;

public class First_Unique_Char_in_String {

        public int firstUniqChar(String s) {
            int[] freq = new int[26];

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                freq[c - 'a']++;
            }
            for(int i = 0; i < s.length(); i++){
                if(freq[s.charAt(i) - 'a'] == 1){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {

    }
}


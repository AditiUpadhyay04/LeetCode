package HashMapp;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingWords {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> hs = new HashSet<>();

            int i = 0;
            int maxi = 0;
            for(int j = 0; j < s.length(); j++){
                while(hs.contains(s.charAt(j))){
                    hs.remove(s.charAt(i));
                    i++;
                }
                hs.add(s.charAt(j));
                maxi = Math.max(maxi , j - i + 1);

            }
            return maxi;
        }

    public static void main(String[] args) {

    }
}

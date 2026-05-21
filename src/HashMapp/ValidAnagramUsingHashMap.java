package HashMapp;

import java.util.HashMap;

public class ValidAnagramUsingHashMap {
    public boolean isAnagram(String s, String t) {
        boolean res = true;
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> h1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            h1.put(ch, h1.getOrDefault(ch, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);

            if (!h1.containsKey(ch)) {
                return false;
            }
            h1.put(ch, h1.get(ch) - 1);

            if (h1.get(ch) == 0) {
                h1.remove(ch);
            }
        }
        if (h1.size() == 0) {
            res = true;
        } else {
            res = false;

        }
        return res;

      }

   public static void main(String[] args) {

   }

}

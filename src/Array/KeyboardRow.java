package Array;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
        public String[] findWords(String[] words) {

            String row1 = "qwertyuiop";
            String row2 = "asdfghjkl";
            String row3 = "zxcvbnm";

            List<String> ans = new ArrayList<>();

            for(int i = 0; i < words.length; i++){
                String s = words[i].toLowerCase();
                String row = "";

                if(row1.indexOf(s.charAt(0)) != -1){
                    row = row1;
                }
                else if(row2.indexOf(s.charAt(0)) != -1){
                    row = row2;
                }
                else{
                    row = row3;
                }

                boolean flag = true;

                for(int j = 1; j < s.length(); j++){
                    if(row.indexOf(s.charAt(j)) == -1){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    ans.add(words[i]);
            }
            return ans.toArray(new String[0]);
        }

    public static void main(String[] args) {

    }
}


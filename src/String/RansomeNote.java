package String;

import java.util.HashMap;

public class RansomeNote {
        public boolean canConstruct(String ransomNote, String magazine) {
            int m = magazine.length();
            int n = ransomNote.length();
            HashMap<Character,Integer> mpp = new HashMap<>();
            for(int i = 0; i < m ; i++){
                char ch = magazine.charAt(i);
                mpp.put(ch,mpp.getOrDefault(ch,0) + 1);
            }

            for(int i = 0; i < n; i++){
                char ch = ransomNote.charAt(i);
                // if(mpp.getOrDefault(ch,0) == 0){
                //     return false;
                // }
                mpp.put(ch,mpp.getOrDefault(ch,0) - 1);
            }

            for(char key : mpp.keySet()){
                if(mpp.get(key) < 0){
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {

    }
}


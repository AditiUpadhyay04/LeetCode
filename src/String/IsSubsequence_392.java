package String;

public class IsSubsequence_392 {
        public boolean isSubsequence(String s, String t) {
            int n = s.length();
            int m = t.length();
            int i = 0;
            int j = 0;
            while (i < n && j < m){
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                }
                j++;
            }
            if(i == n){
                return true;
            }
            else{
                return false;
            }
        }
    public static void main(String[] args) {

    }
}


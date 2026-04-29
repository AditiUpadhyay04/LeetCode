package String;

import java.util.HashSet;

public class PathCrossing {
        public boolean isPathCrossing(String path) {
            int n = path.length();
            HashSet<String> set = new HashSet<>();
            int a = 0;
            int b = 0;
            set.add("0,0");
            for(int i = 0; i < n; i++){
                char ch = path.charAt(i);
                if(ch == 'N'){
                    b++;
                }
                else if(ch == 'S'){
                    b--;
                }
                else if(ch == 'E'){
                    a++;
                }
                else{
                    a--;
                }
                String ans = a + "," + b;
                if(set.contains(ans)) return true;

                set.add(ans);
            }
            return false;

        }

    public static void main(String[] args) {

    }
}


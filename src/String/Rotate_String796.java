package String;

public class Rotate_String796 {

        public boolean rotateString(String s, String goal) {
            if(s.length() != goal.length()){
                return false;
            }
            int n = s.length();

            for(int i = 0; i < n; i++){
                if(s.equals(goal)){
                    return true;
                }
                s = s.substring(1) + s.charAt(0);
            }
            return false;
        }

    public static void main(String[] args) {

    }
}


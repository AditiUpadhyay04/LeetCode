package String;

public class Move_Pieces_To_Obtain_String {
        public boolean canChange(String start, String target) {
            int n = start.length();
            int m = target.length();
            if(!start.replace("_" , "").equals(target.replace("_" , ""))){
                return false;
            }

            int i = 0;
            int j = 0;

            while(i < n && j < m){
                while(i < n &&  start.charAt(i) == '_'){
                    i++;
                }
                while(j < m && target.charAt(j) == '_'){
                    j++;
                }

                if(i == n || j == m){
                    return i == n && j == m;
                }
                if(start.charAt(i) == 'L' && i < j){
                    return false;
                }
                if(start.charAt(i) == 'R' && i > j){
                    return false;
                }
                i++;
                j++;
            }
            return true;

        }

    public static void main(String[] args) {

    }
}


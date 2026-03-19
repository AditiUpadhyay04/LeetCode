package String;

public class Check_If_One_String_Swap_Can_Make_Strings_Equal {
        public boolean areAlmostEqual(String s1, String s2) {
            int n = s1.length();
            int m = s2.length();

            char a = 0;
            char b = 0;
            int count = 0;

            for(int i = 0 ; i < n; i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    count++;

                    if(count == 1){
                        a = s1.charAt(i);
                        b = s2.charAt(i);

                    }
                    else if(count == 2){
                        if(s1.charAt(i) != b || s2.charAt(i) != a){
                            return false;

                        }
                    }
                    else{
                        return false;
                    }
                }
            }
            return count == 0 || count == 2;

        }

    public static void main(String[] args) {

    }
}

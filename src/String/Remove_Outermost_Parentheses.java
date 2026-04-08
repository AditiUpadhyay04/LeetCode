package String;

public class Remove_Outermost_Parentheses {
        public String removeOuterParentheses(String s) {
            StringBuilder sb = new StringBuilder();

            int count = 0;
            int n = s.length();

            for(int i = 0; i < n; i++){
                char ch = s.charAt(i);

                if(ch == '('){
                    if(count > 0){
                        sb.append(ch);
                    }
                    count++;
                }
                else{
                    count--;
                    if(count > 0){
                        sb.append(ch);
                    }
                }
            }
            return sb.toString();
        }

    public static void main(String[] args) {

    }
}

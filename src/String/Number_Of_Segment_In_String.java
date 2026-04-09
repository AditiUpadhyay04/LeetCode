package String;

public class Number_Of_Segment_In_String {
        public int countSegments(String s) {
            int n = s.length();

            int count = 0;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')){
                    count++;
                }
            }

            return count;
        }

    public static void main(String[] args) {

    }
}


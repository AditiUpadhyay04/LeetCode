package String;

public class Reverse_Letter_917 {
        public boolean isLetter(char ch){

            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                return true;
            }
            else{
                return false;
            }
        }
        public String reverseOnlyLetters(String s) {
            char [] arr = s.toCharArray();
            int n = s.length();
            int i = 0;
            int j = n - 1;
            while(i < j){
                while( i < j && !isLetter(arr[i])){
                    i++;
                }
                while(i < j && !isLetter(arr[j])){
                    j--;
                }

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
            return new String(arr);

        }

    public static void main(String[] args) {

    }
}


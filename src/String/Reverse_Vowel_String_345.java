package String;

public class Reverse_Vowel_String_345 {

        public boolean isVowel(char ch){
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return true;
            }
            else{
                return false;
            }
        }
        public String reverseVowels(String s) {
            char [] arr = s.toCharArray();
            int n = arr.length;

            int i = 0;
            int j = n - 1;
            while(i < j){
                while( i < j && !isVowel(arr[i])){
                    i++;
                }
                while(i < j && !isVowel(arr[j])){
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


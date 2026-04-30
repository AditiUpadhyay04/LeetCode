package String;

public class ValidWord {
        public boolean isValid(String word) {
            if(word.length() < 3) return false;

            boolean vowel = false;
            boolean consonant = false;
            String Vow = "aeiouAEIOU";

            for(int i = 0 ; i < word.length(); i++){
                char ch = word.charAt(i);

                if(!Character.isLetterOrDigit(ch)){
                    return false;
                }
                if(Character.isLetter(ch)){
                    if(Vow.indexOf(ch) != -1){
                        vowel = true;
                    }
                    else{
                        consonant = true;
                    }
                }
            }
            return vowel && consonant;
        }

    public static void main(String[] args) {

    }
}


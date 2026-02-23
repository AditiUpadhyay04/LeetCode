package String;

public class String_Halves_Alike_1704 {
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
                || c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }

    public boolean halvesAreAlike(String s) {
        int i = 0;
        int j = s.length() - 1;
        int count = 0;

        while (i < j) {
            if (isVowel(s.charAt(i)))
                count++;
            if (isVowel(s.charAt(j)))
                count--;
            i++;
            j--;
        }
        return count == 0;
    }

    public static void main(String[] args) {

    }
}



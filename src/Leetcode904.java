import java.util.HashMap;

public class Leetcode904 {
        public int totalFruit(int[] fruits) {
            int n = fruits.length;
            int i = 0;
            int j = 0;
            int maxx = 0;

            HashMap<Integer , Integer> Hmm = new HashMap<>();

            while(j < n){
                Hmm.put(fruits[j] , Hmm.getOrDefault(fruits[j] , 0) + 1);

                if(Hmm.size() <= 2){
                    maxx = Math.max(j - i + 1, maxx);
                    j++;
                }
                else{
                    while(Hmm.size() > 2){
                        Hmm.put(fruits[i] ,Hmm.get(fruits[i] )- 1);

                        if(Hmm.get(fruits[i]) == 0){
                            Hmm.remove(fruits[i]);
                        }
                        i++;
                    }
                    maxx = Math.max(j - i + 1 , maxx);
                    j++;
                }


            }
            return maxx;

        }

    public static void main(String[] args) {

     }
}

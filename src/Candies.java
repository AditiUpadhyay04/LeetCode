import java.util.ArrayList;
import java.util.List;

public class Candies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int n = candies.length;
            List<Boolean> list = new ArrayList<>();
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++){
                if(candies[i] > max){

                    max = candies[i];
                }
            }
            for(int i = 0; i < n; i++){
                if(candies[i] + extraCandies >= max){
                    list.add(true);
                }
                else list.add(false);
            }
        System.out.println(list);
            return list;


        }

    public static void main(String[] args) {
        int [] arr = {2,3,5,1,3};
        int extraCandies = 3;
        Candies c1 = new Candies();
        c1.kidsWithCandies(arr,extraCandies);
    }
    }


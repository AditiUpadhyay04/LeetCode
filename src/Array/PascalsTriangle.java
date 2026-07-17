package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>();

            for(int i = 0; i < numRows; i++){
                List<Integer> list1 = new ArrayList<>();

                int val = 1;

                for(int j = 0; j <= i; j++){

                    list1.add((int)val);

                    val = val * (i - j)/ (j + 1);

                }
                ans.add(list1);
            }
            return ans;

        }

    public static void main(String[] args) {

    }
}


package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();

        long val = 1;
        for (int i = 0; i <= rowIndex; i++) {
            ans.add((int) val);

            val = val * (rowIndex - i) / (i + 1);

        }

        return ans;
    }

    public static void main(String[] args) {

    }
}


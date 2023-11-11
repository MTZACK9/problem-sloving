package warmup.problem_solving;

import java.util.List;

public class DiagonalDifference {

    // https://www.hackerrank.com/challenges/plus-minus/problem

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as a parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int ltr = 0;
        int rtl = 0;
        int n = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            ltr += arr.get(i).get(i);
            rtl += arr.get(i).get(n - i);
        }
        return Math.abs(ltr - rtl);
    }
}

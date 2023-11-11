package warmup.problem_solving;

import java.util.List;

public class PlusMinus {

    // https://www.hackerrank.com/challenges/plus-minus/problem

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as a parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int positive = 0, negative = 0, zero = 0;

        for (Integer integer : arr) {
            if (integer > 0) positive += 1;
            else if (integer < 0) negative += 1;
            else zero += 1;
        }

        System.out.printf("%.6f\n", (double) positive / arr.size());
        System.out.printf("%.6f\n", (double) negative / arr.size());
        System.out.printf("%.6f\n", (double) zero / arr.size());

    }
}

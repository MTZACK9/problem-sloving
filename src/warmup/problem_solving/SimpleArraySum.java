package warmup.problem_solving;

import java.util.List;

public class SimpleArraySum {

    // https://www.hackerrank.com/challenges/simple-array-sum/problem

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as a parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer integer : ar) {
            sum += integer;
        }
        return sum;
    }
}

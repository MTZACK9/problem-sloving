package warmup.problem_solving;

import java.util.List;

public class AVeryBigSum {
    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as a parameter.
     */
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long l : ar) {
            sum += l;
        }
        return sum;
    }
}

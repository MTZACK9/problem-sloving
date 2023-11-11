package warmup.problem_solving;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    // https://www.hackerrank.com/challenges/compare-the-triplets/problem

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts the following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < 3; i++){
            if(a.get(i) > b.get(i)){
                alicePoints += 1;
            } else if (a.get(i) < b.get(i)) {
                bobPoints += 1;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(alicePoints);
        result.add(bobPoints);

        return result;
    }
}

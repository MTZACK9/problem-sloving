package warmup.problem_solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    // https://www.hackerrank.com/challenges/mini-max-sum/problem

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as a parameter.
     */

    public static void miniMaxSum(List<Integer> arr){
        List<Long> res = new ArrayList<>();
        for(int i = 1; i <= arr.size(); i++){
            long sumRes = 0;
            for(int j = 1; j <= arr.size(); j++){
                if(j==i) continue;
                sumRes += arr.get(j - 1);
            }
            res.add(sumRes);
        }
        long max = Collections.max(res);
        long min = Collections.min(res);

        System.out.println(min+" "+max);
    }

}

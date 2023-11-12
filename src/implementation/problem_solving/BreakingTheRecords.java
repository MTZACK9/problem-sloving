package implementation.problem_solving;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

    // https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> breakingRecords = new ArrayList<>();
        int min = 0,max = 0, miniScore = scores.get(0), maxScore = scores.get(0);

        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) < miniScore){
                miniScore = scores.get(i);
                min++;
            } else if(scores.get(i) > maxScore){
                maxScore = scores.get(i);
                max++;
            }
        }

        breakingRecords.add(max);
        breakingRecords.add(min);

        return breakingRecords;
    }

}

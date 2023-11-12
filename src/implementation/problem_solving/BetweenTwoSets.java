package implementation.problem_solving;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    // https://www.hackerrank.com/challenges/between-two-sets/problem

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts the following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        List<Integer> joinedList = new ArrayList<>();
        joinedList.addAll(a);
        joinedList.addAll(b);
        joinedList.sort(null);
        int numbersBetweenTheSets = 0;

        List<Integer> factors = new ArrayList<>();
        for (int i = joinedList.get(0); i <= joinedList.get(joinedList.size() - 1); i++){
            int finalI = i;
            boolean allMatch = a.stream().allMatch(num -> finalI % num == 0);
            if (allMatch){

                factors.add(finalI);
            }
        }

        if(!factors.isEmpty()){
            for(int fac : factors){
                boolean allMatch = b.stream().allMatch(num -> num % fac == 0);
                if (allMatch){
                    numbersBetweenTheSets++;
                }
            }
        }

        return numbersBetweenTheSets;
    }

}

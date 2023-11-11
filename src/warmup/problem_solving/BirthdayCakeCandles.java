package warmup.problem_solving;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    // https://www.hackerrank.com/challenges/birthday-cake-candles/problem

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int result = 0;
        int max = Collections.max(candles);
        for (int candle : candles){
            if (candle == max) result++;
        }
        return result;
    }

}

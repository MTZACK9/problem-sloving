package implementation.problem_solving;

import java.util.List;

public class AppleAndOrange {

    // https://www.hackerrank.com/challenges/apple-and-orange/problem

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts the following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int applesInTheHouse = 0, orangesInTheHouse = 0;

        for (int apple : apples) {
            if ((apple + a) >= s && (apple + a) <= t) {
                applesInTheHouse++;
            }
        }

        for (int orange : oranges) {
            if ((orange + b) >= s && (orange + b) <= t) {
                orangesInTheHouse++;
            }
        }

        System.out.println(applesInTheHouse);
        System.out.println(orangesInTheHouse);

    }


}

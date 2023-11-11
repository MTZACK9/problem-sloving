package implementation.problem_solving;

public class NumberLineJumps {

    // https://www.hackerrank.com/challenges/kangaroo/problem

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts the following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2){
        int res1 = (x2 - x1);
        int res2 = (v1 - v2);
        int s = (res2 == 0 || res1 == 0) ? 1 : res1 % res2;

        return (v1 >= v2 && s == 0) ? "YES" : "NO";
    }


}

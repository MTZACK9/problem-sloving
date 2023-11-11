package warmup.problem_solving;

public class Staircase {
    // https://www.hackerrank.com/challenges/staircase/problem

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(j <= n-i) System.out.print(" ");
                else System.out.print("#");
            }
            System.out.println();
        }
    }

}

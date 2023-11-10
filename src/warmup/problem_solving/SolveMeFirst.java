package warmup.problem_solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolveMeFirst {
    /*
        Complete the solveMeFirst function in the editor below.
        solveMeFirst has the following parameters:
        int a: the first value
        int b: the second value
        Returns
        - int: the sum of a and b
    */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        int result = solveMeFirst(a, b);

        System.out.println(result);
    }

    private static int solveMeFirst(int a, int b){
        return a + b;
    }
}

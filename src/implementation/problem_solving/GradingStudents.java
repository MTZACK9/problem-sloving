package implementation.problem_solving;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    // https://www.hackerrank.com/challenges/grading/problem

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> finalGrades = new ArrayList<>();

        int nextMultipleFive;

        for (Integer grade : grades) {
            if (grade < 38) {
                finalGrades.add(grade);
            } else {
                nextMultipleFive = (grade / 5 + 1) * 5;
                if ((nextMultipleFive - grade) >= 3) {
                    finalGrades.add(grade);
                } else {
                    finalGrades.add(nextMultipleFive);
                }
            }
        }

        return finalGrades;
    }
}

package warmup.problem_solving;

import java.util.Objects;

public class TimeConversion {

    // https://www.hackerrank.com/challenges/time-conversion/problem

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s){
        String newString = "";
        String[] arr = s.split(":");
        String substring = s.substring(0, s.length() - 2);
        if(s.contains("PM")){
            if(Objects.equals(arr[0], "12")){
                newString = substring;
            } else {
                newString = s.replace(arr[0], (Integer.parseInt(arr[0]) + 12)+"").substring(0, s.length() - 2);
            }
        } else {
            if(Objects.equals(arr[0], "12")){
                newString = s.replace(arr[0], "00").substring(0, s.length() - 2);
            } else {
                newString = substring;
            }
        }
        return newString;

    }

}

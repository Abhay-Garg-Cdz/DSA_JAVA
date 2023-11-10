package arrays;

// import java.lang.reflect.Array;
import java.util.*;

public class RestoreArray1743L {



    // My approach was same as this one just we took an array of size 3 , [no. of occurances, first adjacent pair, second adjacent pair]
    // After this find start of nums with ione having only no. of occurances == 1
    //take second adjacent pair as key and traverse through map to get the value of next adjacents of nums to complete the missing array
    public static int[] restoreArray(int[][] vals) {
        Map<Integer, int[]> pairs = new HashMap<>();
        for (int i = 0; i < vals.length; i++) {
            if (pairs.containsKey(vals[i][0])) {
                pairs.get(vals[i][0])[1] = vals[i][1];
            } else {
                pairs.put(vals[i][0], new int[] {vals[i][1], -1000000});
            }
            if (pairs.containsKey(vals[i][1])) {
                pairs.get(vals[i][1])[1] = vals[i][0];
            } else {
                pairs.put(vals[i][1], new int[] {vals[i][0], -1000000});
            }
        }
        int[] result = new int[vals.length + 1];
        int start = -1000000;
        for (Map.Entry<Integer, int[]> entry : pairs.entrySet()) {
            if (entry.getValue()[1] == -1000000) {
                start = entry.getKey();
            }
        }
        result[0] = start;
        int left = -1000000;
        for (int i = 1; i < result.length; i++) {
            int[] val = pairs.get(start);
            int newval = (val[0] == left ? val[1] : val[0]);
            result[i] = newval;
            left = start;
            start = newval;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] vals = { { -2, 4 }, { 4, 1 }, { 1, -3 } };
        restoreArray(vals);
    }
}

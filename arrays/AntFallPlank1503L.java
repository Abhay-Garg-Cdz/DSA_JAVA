package arrays;

// import java.util.stream.*;
import java.util.Arrays;;
public class AntFallPlank1503L {

    public static int getLastMoment(int n, int[] left, int[] right) {
        

        int left_Max = Arrays.stream(left).max().orElse(0);
        int right_Min = Arrays.stream(right).min().orElse(0);

        
        return Math.max(n-right_Min,left_Max); 

    }
    public static void main(String[] args) {
        System.out.println(getLastMoment(7,new int[]{},new int[]{0,1,2,3,4,5,6,7}));
    }
}

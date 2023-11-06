package arrays;
import java.util.Arrays;
public class RunningSum {
    public  static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int tempSum = 0;
        for(int i=0;i<nums.length;i++){
            tempSum = tempSum + nums[i];
            runningSum[i] = tempSum;
        }
        return runningSum;
    }
    
    public static void main(String[] args) {
       int[] n =  runningSum(new int[]{1,2,3,4});
       Arrays.stream(n).forEach(System.out::println);
    }
}

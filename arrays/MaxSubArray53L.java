package arrays;

import java.util.SortedSet;
import java.util.TreeSet;

public class MaxSubArray53L {

    //O(n^3)
    public static int maxSubArrayApproach1(int[] nums) {
        int sum = 0;
        SortedSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for(int j = i;j<nums.length;j++){
                for(int k = i;k<=j;k++){
                    sum = sum+nums[k];
                }
                set.add(sum);
                sum = 0;
            }
        }

        sum = set.last();

        return sum;
    }

    //using kadane's algorithm
    public static int maxSubArrayKadaneAlgo(int[] nums) {
        int max_sum= Integer.MIN_VALUE;
        int cur_max = 0;

        for(int i = 0;i<nums.length;i++){
            cur_max = cur_max + nums[i];
            if(cur_max>max_sum){
                max_sum = cur_max;
            }
            if(cur_max<0){
                cur_max = 0;
            }
        }

        return max_sum  ;
    }


    public static void main(String[] args) {
        int sum = maxSubArrayKadaneAlgo(new int[] {5,4,-1,7,8});
        System.out.println(sum);
    }
}
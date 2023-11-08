package arrays;

import java.util.Arrays;

public class RemoveDuplicatesII80L {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[j-1] && count<2){
                nums[j] = nums[i];
                count++;
                j++;
            }
            if(nums[i]==nums[j-1] && count==2){
                continue;
            }
            
            if(nums[i]!=nums[j-1]){
                nums[j] = nums[i];
                count = 1;
                j++;
            }

        }
        Arrays.stream(nums).forEach(System.out::print);
        return j;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        removeDuplicates(nums);
    }
}

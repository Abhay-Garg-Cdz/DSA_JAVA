package arrays;
import java.util.Arrays;
public class MoveZeroes283L {


    //Approach-1 using additional space
    public static void moveZeroesApproach1(int[] nums) {
        int[] n = new int[nums.length];
        // int count = 0;
        int j =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                // count++;
                continue;
            }
            else {
                n[j] = nums[i];
                j++;
            }
        }

        Arrays.stream(n).forEach(System.out::println);
    }

    public static void moveZeroesApproach2(int[] nums) {
        // int[] n = new int[nums.length];
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
            }
        }
        System.out.println(count);
        int j =0;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0 || nums[i]<0){
                nums[j] = nums[i];
                j++;   
            }
        }
        // Arrays.stream(n).forEach(System.out::print);
        int k = nums.length-1;
        while(count>0){
            nums[k] = 0;
            k--;
            count--;
        }
        

        // Arrays.stream(nums).forEach(System.out::print);
    }

    public static void main(String[] args) {
        moveZeroesApproach2(new int[]{0,1,0,3,0,7,0,12,0,5});
    }
}

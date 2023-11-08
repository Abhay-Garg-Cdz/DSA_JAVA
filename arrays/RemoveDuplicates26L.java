package arrays;
import java.util.Arrays;
public class RemoveDuplicates26L {
    public static int removeDuplicates(int[] nums) {
        int non_repeat = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[non_repeat-1]){
                nums[non_repeat]= nums[i];
                non_repeat++;
            }
        }
        Arrays.stream(nums).forEach(System.out::print);
        return non_repeat;
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
}

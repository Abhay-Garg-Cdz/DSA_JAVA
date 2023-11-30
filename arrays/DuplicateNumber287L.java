package arrays;
import java.util.*;

public class DuplicateNumber287L {

    // TL Exceeded
    public static int findDuplicateApp1(int[] nums) {
        int j =nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            while (i<j) {
                if(nums[i]== nums[j]){
                    return nums[i];
                    
                }
            j--;
            }
            j =nums.length-1;
        }

        return -1;
    }


    public static int findDuplicateApp2(int[] nums) {
        int [] n = nums.clone();
        Arrays.sort(n);

        for(int i = 1; i<n.length;i++){
            if(n[i-1]==n[i]){
                return n[i];
            }
        }
        return -1;
    }

    public int findDuplicateApp3(int[] nums) {
        int array[] = new int[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            array[nums[i]]++;
            if(array[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;
    }


}

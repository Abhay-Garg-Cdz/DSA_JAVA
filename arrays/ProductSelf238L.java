package arrays;

/**
 * ProductSelf238L
 */
// import java.util.Arrays;

public class ProductSelf238L {

    public static int[] productExceptSelf(int[] nums) {

        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0] = 1;
        rightProduct[nums.length-1] = 1;
        int j =0;
        for(int i = 1;i<nums.length;i++){
            leftProduct[i] = leftProduct[i-1]*nums[j];
            j++;
        }

        // Arrays.stream(leftProduct).forEach(System.out::print);
        // System.out.println();
        // j = nums.length-1;
        for(int i = nums.length-2;i>=0;i--){
            rightProduct[i] = rightProduct[i+1]*nums[j];
            j--;
        }

        // Arrays.stream(rightProduct).forEach(System.out::print);
        // System.out.println();
        for (int i = 0; i < rightProduct.length; i++) {
            nums[i] = leftProduct[i]*rightProduct[i];
        }
        

        // Arrays.stream(nums).forEach(System.out::print);
        return nums;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        productExceptSelf(nums);
    }
    
}
package arrays;

public class MaxProduct152L {
    public static int maxProduct(int[] nums) {
        int currentProduct =nums[0];
        int maxProduct = nums[0];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            
                if(currentProduct==0 && (nums[i]>0 || nums[i]<0)){
                    currentProduct = nums[i];
                }
                else if(currentProduct!=0 && currentProduct>0){
                    currentProduct = nums[i]*currentProduct;
                }
                else if(currentProduct<0){
                    currentProduct = 0;
                }
                if(currentProduct>maxProduct){
                    maxProduct = currentProduct;
                }
            
        }
        System.out.println(maxProduct);
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {-2,3,5,6};
        maxProduct(nums);
    }
}

package Arrays;

public class SmallestRange908L {
    
    public static int smallestRangeI(int[] nums, int k) {
        
        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i<nums.length;i++){

            if(nums[i]<min){
                min = nums[i];

            }
            if(nums[i]>max){
                max = nums[i];
            }
        }

        if(max-k<min+k){
            return 0;
        }
        else{
            return max - min -2*k; 
        }

    }


    public static void main(String[] args) {
        
    }
}

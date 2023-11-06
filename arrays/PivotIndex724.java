package arrays;
// import java.util.Arrays;
import java.util.stream.IntStream;
public class PivotIndex724 {
    public static int pivotIndexApproach1(int[] nums) {
        int prevpivotIndex = -1;
        for(int i=0;i<=nums.length-1;i++){
            int leftSum;
            if(i==0){
                leftSum = 0;
            }else{
                leftSum = sum(nums,0,i-1);
            }
            int rightSum;
            if(i==nums.length-1){
                rightSum = 0;
            }else{
                rightSum = sum(nums,i+1,nums.length-1);
            }
            
            if(leftSum==rightSum){
                prevpivotIndex = i;
                break;
            }
        }
        if(prevpivotIndex == -1){
            return -1;
        }
        return prevpivotIndex;
    }

    public static int sum(int[] nums,int i,int j){
        int sum = 0;
        for(;i<=j;i++){
            sum = sum + nums[i];
        }
        return sum;
    }

    // Approach-2 (much Simpler)
    public static int pivotIndexApproach2(int[] nums) {
        int totalWeightOnLeft = 0;
        int totalWeightOnRight = IntStream.of( nums ).sum();
        
        for( int i = 0 ; i < nums.length ; i++ ){
            
            int curWeight = nums[i];
            
            totalWeightOnRight -= curWeight;
            
            if( totalWeightOnLeft == totalWeightOnRight ){
                // balance is met on both sides
                return i;
            }
            
            totalWeightOnLeft  += curWeight;
        }
        
        return -1;
    }



    public static void main(String[] args) {
        // int sum[] = new int[]{-1,-1,0,1,1,0};
       int n =  pivotIndexApproach2(new int[]{-1,-1,0,1,1,0});

       System.out.println(n);
    //  int n = sum(sum, 0,5);
    //  System.out.println(n);
    
    }
}

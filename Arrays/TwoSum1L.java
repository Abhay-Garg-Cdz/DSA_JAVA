package Arrays;
public class TwoSum1L {
    
    public static int[] twoSum(int[] nums, int target) {
        
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum = nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
                sum = nums[i];
            }
        }
        

        return null;
    }

    public static void main(String[] args) {
        
        int[] arra = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(arra[0]+" " + arra[1]);
    }
}

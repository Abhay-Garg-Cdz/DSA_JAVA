package Arrays;
public class ShuffleArray1470L {
    
    public static int[] shuffle(int[] nums, int n) {
        

        int [] newArray = new int[2*n];

        System.out.println(newArray.length);
        int newArrayIndex = 0;
        for(int i = 0; i<n;i++){
             newArray[newArrayIndex] = nums[i];
             newArrayIndex++;
             newArray[newArrayIndex] = nums[n];

             System.out.println("Current Value:" + newArrayIndex);
             newArrayIndex++;
             n++; 
        }

        return newArray;
    }



    public static void main(String[] args) {
        
        int []arr = shuffle(new int[]{2,5,1,3,4,7},3);
    }

}

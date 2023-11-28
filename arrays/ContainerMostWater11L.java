package arrays;

public class ContainerMostWater11L {


    // Faulty Approach..

    // public static int maxArea(int[] height) {
        
    //     int maxl = Integer.MIN_VALUE;
    //     int maxr = Integer.MIN_VALUE;
    //     int i , j;

    //     for(i=0;i<height.length;i++){
    //         if(maxl>height[i]){
    //             break;
    //         }
    //         maxl = height[i];
    //     }

    //      for(j=height.length-1;j>0;j--){
    //         if(maxr>height[j]){
    //             break;
    //         }
    //         maxr = height[j];
    //     }

    //     return Math.min(maxr, maxl) * (j-i+2);
        
    // }



    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        
        int[] nums = {1,1};
        System.out.println(maxArea(nums));
    }
}

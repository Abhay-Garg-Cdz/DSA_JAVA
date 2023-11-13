package arrays;

public class TrappingRainWater42L {

    public int trap(int[] height) {
    int[] left_Max = new int[height.length];
    left_Max[0] = height[0];
    for(int i = 1;i<height.length;i++){
        left_Max[i] = Math.max(height[i],left_Max[i-1]);

    }
    int[] right_Max = new int[height.length];
    right_Max[height.length-1] = height[height.length-1];
    for(int i = height.length-2;i>=0;i--){
        right_Max[i] = Math.max(height[i], right_Max[i+1]);
    }
        int trapped_water = 0;
    for(int i=0;i<height.length;i++){
        trapped_water += Math.min(left_Max[i], right_Max[i]) - height[i];
    }
        return trapped_water;
    }

    public static void main(String[] args) {
        
    }
}

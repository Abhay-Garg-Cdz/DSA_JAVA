package arrays;

import java.util.*;
public class SubArraySumK560L {


    // Only 67 testcases passed -- Worst-- O(n^2)
    public static int subarraySumAppr1(int[] nums, int k) {
        int count = 0;
        for(int i =1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        Arrays.stream(nums).forEach(System.out::print);        
        for(int i = nums.length-1;i>=0;i--){
            for (int j = 0; j < i; j++) {
                
                if((nums[i]-nums[j]) == k){
                    count++;
                }
                if(k>nums[i]){
                    break;
                }
            }
        }
        return count;
    }



    // Using HashMap --O(n)
    public int subarraySumAppr2(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            sum += nums[j];
            if(map.containsKey(sum -k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subarraySumAppr1(nums, 2));
    }
}

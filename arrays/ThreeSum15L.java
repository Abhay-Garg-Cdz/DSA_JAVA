package arrays;

import java.util.*;

public class ThreeSum15L {
    
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i<nums.length;i++){
            
            
            int a = -nums[i];
            int s = i+1,e=nums.length-1;
            while(s<e){
                if(nums[s]+nums[e] == a){
                    list.add(Arrays.asList(nums[i], nums[s], nums[e]));
                    while(s<e && nums[s]==nums[s+1])s++;
                    while(s<e && nums[e]==nums[e-1])e--;
                    s++;
                    e--;
                }
                else if(nums[s]+nums[e] > a)e--;
                else{s++;}
            }
            while(i+1<nums.length && nums[i]==nums[i+1]){
                i++;
            }
            
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }
}

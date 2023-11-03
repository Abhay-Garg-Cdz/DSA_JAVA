package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumL {

    // By Brute Force
    public int[] twoSumbruteForce(int[] nums, int target) {
        int[] solutionArray = new int[2];
        
        for(int i =0; i<nums.length;i++){
            int num1 = nums[i];
            for(int j = i+1;j<nums.length;j++){
                int num2 = nums[j];
                if(num1 + num2 == target){
                    solutionArray[0] = i;
                    solutionArray[1] = j;
                    return solutionArray;
                }
            }
        }

        return new int[]{};
    }

    //By Two-pass Hash Table

    public int[] twoSumTwoPassHashTable(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }

    //One-pass Hash Table

    public int[] twoSumOnePassHashTable(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    public static void main(String[] args) {
        int[] nums ={3,3};
        int target = 6;
        TwoSumL n = new TwoSumL();
        nums = n.twoSumbruteForce(nums, target);
        System.out.println(nums[0] + " " + nums[1]);
    }

}

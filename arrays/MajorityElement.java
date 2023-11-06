package arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement {

    //Approach-1 [Using HashMap] Space(>1)
    public static int majorityElementApproach1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(nums[0], 1);
        for(int i = 1; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        int n = nums.length/2;
        for(int i = 0; i<nums.length;i++){
            if(map.get(nums[i])>n){
                return nums[i];
            }
        }
        return -1;
    }

    //Approach-2 [Using Recursion] Space(1)
    public static int majorityElementApproach2(int[] nums) {
        return helper(nums,0,nums[0]);
    }
    public static int helper(int[] nums, int si, int ref){
        int c=0;
        for(int i=si;i<nums.length;i++){
            if(c>nums.length/2)return ref;
            if(nums[i]==ref)
                c++;
                
            else
                c--;
            if(c==-1)
                return helper(nums,i,nums[i]);
        }return ref;
 
    }

    //Approach-3 [Using Streams and lambda exp.]
    public int majorityElement(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        return map.entrySet().stream()
                .filter(e -> e.getValue() > nums.length / 2)
                .mapToInt(Map.Entry::getKey)
                .limit(1).sum();
    }
      
    public static void main(String[] args) {
        System.out.println(majorityElementApproach2(new int[]{3,3,4}));
    }
}



package arrays;
import java.util.HashSet;
import java.util.TreeMap;
public class ContainsDuplicate217L {
    
    public static boolean containsDuplicateTreeMap(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        return false;
    }


    public boolean containsDuplicateHshSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)) return true;
            else set.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
       boolean b =  containsDuplicateTreeMap(new int[]{1,1,1,3,3,4,3,2,4,2});
        System.out.println(b);
        // TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        
    }
}

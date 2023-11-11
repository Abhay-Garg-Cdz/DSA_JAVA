package hashtable;

import java.util.*;
public class RandomizedSet380L {

    // static HashSet<Integer> set;
    // public  void RandomizedSet() {
    //     set  = new HashSet<Integer>();
    // }
    
    // public boolean insert(int val) {
    //     if(set!=null && set.contains(val)){
            
    //         return false;
    //     }
    //     set.add(val);
    //     return true;
    //   }
    
    // public boolean remove(int val) {
    //     if(set.contains(val)){
    //     set.remove(val);
    //     return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    
    // public int getRandom() {
    //     Random generator = new Random();
        
    //     // Arrays.stream(values).forEach(System.out::print);
    //     Object[] arr = set.toArray();
    //     int x = generator.nextInt(arr.length);
    //     return (int)arr[x];

    // }

    



    static HashMap<Integer,Integer> map;
    public  void RandomizedSet() {
        map  = new HashMap<Integer,Integer>();
    }
    
    public boolean insert(int val) {
        if( map!=null && map.containsKey(val)){
            
            return false;
        }
        map.put(val,1);
        return true;
      }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
        map.remove(val);
        return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {
        Random generator = new Random();
        Object[] values = map.keySet().toArray();
        // Arrays.stream(values).forEach(System.out::println);
        Integer randomValue = (Integer)values[generator.nextInt(values.length)];
        return randomValue;
    }
    public static void main(String[] args) {
        RandomizedSet380L r = new RandomizedSet380L();
        r.RandomizedSet();
        r.insert(1);
        r.insert(2);
        r.insert(2);
        r.insert(1);
        r.insert(2);
        r.remove(1);
        System.out.println(r.getRandom());


    }
}




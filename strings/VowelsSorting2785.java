package strings;

import java.util.*;
public class VowelsSorting2785 {
    

    // Using ArrayList
    public static  String sortVowelsApproach1(String s) {
        
        ArrayList<Character> vowels_arr = new ArrayList<Character>();
        // ArrayList<Integer> index_arr = new ArrayList<Integer>();


         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||  s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' ||s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U'){
                vowels_arr.add(s.charAt(i));
                // index_arr.add(i);
            }
         }
         Collections.sort(vowels_arr);
         int j =0;
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||  s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' ||s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U'){
                sb.append(vowels_arr.get(j));
                j++;
            }
            else{
                sb.append(s.charAt(i));
            }
         }

         return sb.toString();
    }



    // Using Priority Queue

    // Takes More time than appr.1
    
        public static String sortVowelsApproach2(String s) {
            List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
            PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> (int) a - (int) b);
            StringBuilder ans = new StringBuilder();
    
            for (char c : s.toCharArray()) {
                if (vowels.contains(c)) {
                    pq.offer(c);
                }
            }
    
            for (char c : s.toCharArray()) {
                if (!vowels.contains(c)) {
                    ans.append(c);
                } else {
                    ans.append(pq.poll());
                }
            }
    
            return ans.toString();
        }
    

    public static void main(String[] args) {
       System.out.println(sortVowelsApproach2("lEetcOde"));
    }
}

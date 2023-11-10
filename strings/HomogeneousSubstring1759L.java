package strings;

import java.io.IOException;
import java.util.ArrayList;

/**
 * HomogeneousSubstring1759L
 */
public class HomogeneousSubstring1759L {

    public static int countHomogenous(String s) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int j = 0;
        list.add(0, 1);
        int count = 1;
        System.out.println(s.length());
        System.out.println(list);
        for (int i = 1; i <= s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                list.remove(j);
                // System.out.println(list);
            } else if (s.charAt(i) != s.charAt(i - 1)) {
                count = 1;
                j++;
                System.out.println(list);
            }
            list.add(j, count);
            // System.out.println(list);
        }
        long counts = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            long k = list.get(i);
            counts = counts + ((k * (k + 1)) / 2);
        }
        counts = counts%1000000007;
        System.out.println(counts);
        return (int)counts;
        
    }

    public static void main(String[] args) throws IOException{
        // String content = new String(Files.readAllBytes(Paths.get("test.txt")));
        long count = countHomogenous("aabbbhhhawetuu");
        System.out.println(count);
        // count(100000);
    }

    // static int  count(int number){
    //     long count=0;
    //     for (int i = 1; i < number+1; i++) {
    //         count = count+i;
    //     }
    //     System.out.println(count);
    //     // System.out.println();
    //     count = count%1000000007;
    //     System.out.println(count);
    //     return (int)count;
    // }
}
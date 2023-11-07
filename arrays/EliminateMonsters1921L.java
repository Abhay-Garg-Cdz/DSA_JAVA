package arrays;

import java.util.*;

public class EliminateMonsters1921L {

    //Approach-1
    public static int eliminateMaximum(int[] dist, int[] speed) {
    
        double[] speedArray = new  double[dist.length];
        for(int i=0;i<dist.length;i++){
            speedArray[i] = (double)dist[i]/speed[i];
        }
        System.out.println("\nS/D");
        // Arrays.stream(speed).forEach(System.out::print);
        int time = 0;
        for(int i = 1;i<speed.length;i++){
            if(time<speed[i+1]){
                time++;
            }
            else{
                break;
            }
        }
        return time;
    }

    //Approach-2 [same as 1 just a little difference]
    public int eliminateMaximum1(int[] dist, int[] speed) {
        int n = dist.length;
         double[] time = new double[dist.length];
         
         for (int i = 0; i < n; i++) {
             time[i] = (double)dist[i] / speed[i];
         }
         
         Arrays.sort(time);
         
         for (int i = 0; i < n; i++) {
             if (time[i] <= i) {
                 return i;
             }
         }
         
         return n;
     }
    public static void main(String[] args) {
        int[] dist = {3,5,7,4,5};
        int[] speed = {2,3,6,3,2};
        int win = eliminateMaximum(dist, speed);
        // System.out.println();
        System.out.println(win);
    }
}

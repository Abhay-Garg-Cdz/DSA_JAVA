package arrays;
import java.util.*;
public class SpiralMatrix54L {


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        
        int rmin = 0;
        int cmin = 0;
        int rmax = n-1;
        int cmax = m-1;
        int counter = 1;
        
        
         while(counter<=n*m){
             //top boundary
            for(int col = cmin;col<=cmax && counter<=n*m;col++){
               li.add(matrix[rmin][col]);
                counter++;
            }
            rmin++;
            
              //right boundary
            for(int row = rmin;row<=rmax && counter<=n*m;row++){
              li.add(matrix[row][cmax]);
                counter++;
            }
            cmax--;
            
            
            //bottom boundary
            for(int col = cmax;col>=cmin && counter<=n*m;col--){
              li.add(matrix[rmax][col]);
                counter++;
            }
            rmax--;
            
            
            //left boundary
            for(int row = rmax;row>=rmin && counter<=n*m;row--){
               li.add(matrix[row][cmin]);
                counter++;
            }
            cmin++;
            
           
        }
        System.out.println(li);
        
        return li;
        
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(matrix);
    }
}

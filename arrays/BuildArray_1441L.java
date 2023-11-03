package arrays;
import java.util.ArrayList;
import java.util.List;
public class BuildArray_1441L {
    public static List<String> solution(int[] target, int n){

        
        List<String> output = new ArrayList<String>();
        int indexNumber = 1;
        for(int targetIndex =0;targetIndex<target.length;targetIndex++){
            
            output.add("Push");
            if(indexNumber != target[targetIndex] && indexNumber<=n){
                output.add("Pop");
                targetIndex--;
                
            }
            indexNumber++;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] a = {1,3};

        List<String>output = BuildArray_1441L.solution(a, 3);

        System.out.println(output);
    }
}

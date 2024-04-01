package arrays;

public class ElementAppearing1287L {
    public static int findSpecialInteger(int[] arr) {
        
        int count = arr.length/4;
        int repeat = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                return repeat;
            }
            if(arr[i] == arr[i-1]){
                count--;
                repeat = arr[i];
            }
            else{
                count = arr.length/4;
            }
        }

        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        
    }
}

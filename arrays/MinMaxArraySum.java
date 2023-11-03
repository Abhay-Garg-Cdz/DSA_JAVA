package arrays;
import java.util.Arrays;

public class MinMaxArraySum {
    public static int findSum(int A[],int N) 
    {
        //code here
        Arrays.sort(A);
        return A[0]+A[A.length-1]; 

    }

    public static void main(String[] args) {
        int A[] = {-2, 1, -4, 5, 3};
        int n = MinMaxArraySum.findSum(A,5);
        System.out.println(n);
    }
}

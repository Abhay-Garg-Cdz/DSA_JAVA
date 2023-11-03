package pattern;
public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        int n = 25;
        for(int i = 1;i<=n;i++){
            //Inner loop
            for(int j= 1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            }
    }
}

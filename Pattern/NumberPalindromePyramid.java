public class NumberPalindromePyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<=n;i++){
            // int num = i;
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            for(int j = 2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

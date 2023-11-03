public class Butterfly {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n*2;i++){
            for(int j = 1;j<=n*2;j++){
                if(i<=4 && (j>=i+1 && j<=n*2-i)){
                System.out.print(" ");
                }
                else if(i>=5 && (j>=n*2-i+2 && j<=i-1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }           
            System.out.println();
            }


            System.out.println("\n\n\n\n");

            // Alternative approach

            //first half
            for(int i = 1;i<=n;i++){
                //stars - i 
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                //spaces - 2*(n-1)
                for(int j = 1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                //stars - i
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //second half
            for(int i = n;i>=1;i--){
                //stars - i 
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                //spaces - 2*(n-1)
                for(int j = 1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                //stars - i
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

    }

}
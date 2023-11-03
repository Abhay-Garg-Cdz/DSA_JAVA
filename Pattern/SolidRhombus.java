public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;

        long t1 = System.currentTimeMillis();
        for(int i = 1;i<=n;i++){
            // 1. j<=2n-1 - j<=n-i  || ((2n-1)-(i+2) ====> 2n-i+1)
            for(int j = 1;j<=2*n-1;j++){
                if(j<=n-i || j>=2*n-i+1){
                    System.out.print("a");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();        
           }
    
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
           //Alternative approach

           long t3 = System.currentTimeMillis();
           for(int i = 1;i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print("a");
            }

            //stars
            for(int j= 1;j<=n;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        long t4 = System.currentTimeMillis();
        System.out.println(t4-t3);
        }
}

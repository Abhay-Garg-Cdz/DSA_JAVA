public class Triangle0_1 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n;i++){
            
                if(i%2 == 0){
                    for(int j= 1;j<=i;j++){
                        if(j%2 == 0){
                        System.out.print(1);
                        }
                        else{
                            System.out.print(0);
                        }
                    }
                }
                else if(i%2 != 0){
                    for(int j= 1;j<=i;j++){
                        if(j%2 == 0){
                        System.out.print(0);
                        }
                        else{
                            System.out.print(1);
                        }
                    }
                }
            
            System.out.println();
            }


            // Alternative to above

        // int n = 4;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
            }
    }
}

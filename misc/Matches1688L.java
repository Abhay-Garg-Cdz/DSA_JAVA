package misc;

public class Matches1688L {

    public int numberOfMatchesAppr1(int n) {
        int matches = 0;
        while(n>1){
            if(n%2==0){
                n = n/2;
                matches += n;
            }
            else{
                matches += (n-1)/2;
                n = (n - 1) / 2 + 1;
            }
        }
        return matches;
    }


    public int numberOfMatchesAppr2(int n) {
        return n-1;
    }


    public static void main(String[] args) {
        int matches = 0;
        int n = 14;
        while(n>1){
            if(n%2==0){
                n = n/2;
                matches += n;
            }
            else{
                matches += (n-1)/2;
                n = (n - 1) / 2 + 1;
            }
        }
        System.out.println(matches);;
        
    }
}

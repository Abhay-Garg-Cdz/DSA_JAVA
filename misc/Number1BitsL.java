package misc;

public class Number1BitsL {

    public static int hammingWeight(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 0b00000000000000000000000000001011;

        

        System.out.println(hammingWeight(n));
    }
}

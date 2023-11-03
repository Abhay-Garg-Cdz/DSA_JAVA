package strings;

public class StringRev {

    public static String stringReverse(String s){

        String s1 = "";
        int len = s.length();
        for(int i=len-1;i>=0;i--){
            s1 = s1 +s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        StringRev.stringReverse("Abhay Garg");
    }
}

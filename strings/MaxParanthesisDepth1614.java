package strings;

public class MaxParanthesisDepth1614 {
    

    public static int maxDepth(String s) {
        int maxDepth = 0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                temp++;
            }
            if(temp>maxDepth){
                maxDepth = temp;
            }
            if(s.charAt(i)==')'){
                temp--;
            }
            
        }
        return maxDepth;
    }

    public static void main(String[] args) {
       System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}

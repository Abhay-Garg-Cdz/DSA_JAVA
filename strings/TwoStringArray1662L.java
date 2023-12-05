package strings;

public class TwoStringArray1662L {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        for (String i : word1) {
            s1.append(i);
        }
        for (String i : word2) {
            s2.append(i);
        }      
        return s1.toString().equals(s2.toString());
    }

    
}

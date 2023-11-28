package arrays;

public class PairOfSongs1010L {


    // Time Exceeded
    public static int numPairsDivisibleBy60App1(int[] time) {
        int count = 0;
        int j = time.length-1;
        for (int i = 0;i<time.length;i++) {
            while(i<j){
                int sum =time[i]+time[j];
                if(sum%60 == 0){
                    count++;
                }
                j--;
            }
            j = time.length-1;
        }
        return count;
    }

    public int numPairsDivisibleBy60App2(int[] time) {
        int[] freq = new int[60];
        int res=0;

        for(int t: time){
            int val = t%60;
            if(val==0){
                res += freq[0];
            }
            else{
                res += freq[60-val];
            }
            freq[val]++;
        }
        return res;
    }
}

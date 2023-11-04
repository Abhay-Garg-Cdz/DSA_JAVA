package arrays;

public class BuySellStock121L {
    

    //Limited Execution --[2,4,1] -- not pass
    public static int maxProfitApproach1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int j =0;
        int i =0;
        for(i= 0;i<prices.length;i++){


            if(min>prices[i]){
                min = prices[i];
                j = i;
            }
        }
        for(int k =j;k<prices.length;k++){
            if(max<prices[k]){
                max = prices[k];
            }
        }


        return max - min;
    }


    //Approach-2 
    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }


    // int min_price = prices[0];
    //     int maxprof = 0;

    //     for(int i=1;i<prices.length;i++){
    //         maxprof = Math.max(maxprof,prices[i]-min_price);
    //         min_price = Math.min(prices[i],min_price);
    //     }

    //     return maxprof;


    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,4,1}));
    }
}

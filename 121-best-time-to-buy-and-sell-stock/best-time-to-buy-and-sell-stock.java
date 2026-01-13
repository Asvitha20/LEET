class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int dif;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                dif=prices[i]-min;
                if(dif>max) max=dif;
            }
        }
        return max;
    }
}
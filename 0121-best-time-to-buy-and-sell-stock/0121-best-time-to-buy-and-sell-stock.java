class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                profit=prices[i]-min;
                max=Math.max(profit,max);
            }
            else{
                profit=prices[i]-min;
                max=Math.max(profit,max);
            }
        }
        return max;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int sell[]=new int[n];
        sell[n - 1] = prices[n - 1];
        for(int i=n-2;i>=0;i--){
            sell[i]=Math.max(prices[i],sell[i + 1]);
        }
        int diff=0;

        for(int i=0;i<n;i++){
            diff=Math.max(sell[i]-prices[i],diff);
        }
        return diff;
        
    }
}
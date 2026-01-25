class Solution {
    private int solve(int i,int flag,int prices[],int dp[][]){
        if(i>=prices.length)return 0;
        if(dp[i][flag]!=-1)return dp[i][flag];
        int profit;
        if(flag==1){
            int canBuy=-prices[i]+solve(i+1,0,prices,dp);
            int skip=solve(i+1,1,prices,dp);
            profit=Math.max(canBuy,skip);
        }
        else{
            int canSell=prices[i]+solve(i+1,1,prices,dp);
            int skip=solve(i+1,0,prices,dp);
            profit=Math.max(canSell,skip);
        }
        return dp[i][flag]=profit;
        
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,1,prices,dp);//initially flag is 1 it means not purchased
    }
}
class Solution {
    private int solve(int coins[],int idx,int amount,int dp[][]){
        if(amount==0)return 0;
        if(idx<0)return (int)1e9;
        if(dp[idx][amount]!=-2)return dp[idx][amount];
        int notPick=solve(coins,idx-1,amount,dp);//while skipping there will be change in index 
        //but while picking there would be no change in index as there is no change in index
        int pick=(int)1e9;
        if(amount>=coins[idx]){
            pick=1+solve(coins,idx,amount-coins[idx],dp);
        }
        return dp[idx][amount]=Math.min(pick,notPick);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int row[]:dp)Arrays.fill(row,-2);
        int ans=solve(coins,coins.length-1,amount,dp);
        return ans>=1e9?-1:ans;
    }
}
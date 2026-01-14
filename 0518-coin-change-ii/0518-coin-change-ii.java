class Solution {
    private int solve(int idx,int amount,int coins[],int dp[][]){
        if(idx<0)return 0;
        if(amount==0)return 1;
        if(dp[idx][amount]!=-1)return dp[idx][amount];
        int notPick=solve(idx-1,amount,coins,dp);
        int pick=0;
        if(coins[idx]<=amount){
            pick=solve(idx,amount-coins[idx],coins,dp);
        }
        return dp[idx][amount]=pick+notPick;
        
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int row[]:dp)Arrays.fill(row,-1);
        return solve(n-1,amount,coins,dp);
    }
}
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(solve(n-1,cost,n,dp),solve(n-2,cost,n,dp));
    }
    private int solve(int idx,int cost[],int n,int dp[]){
        if(idx<0)return 0;
        if(idx==0 || idx==1)return cost[idx];
        if(dp[idx]!=-1)return dp[idx];
        return dp[idx]=cost[idx]+Math.min(solve(idx-1,cost,n,dp),solve(idx-2,cost,n,dp));
    }
}
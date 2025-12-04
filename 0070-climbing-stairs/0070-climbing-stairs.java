class Solution {
    private int solve(int dp[],int n){
        if(n<=1)return 1;
        if(dp[n]!=-1)return dp[n];
        dp[n]=solve(dp,n-1)+solve(dp,n-2);
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(dp,n);
    }
    
}
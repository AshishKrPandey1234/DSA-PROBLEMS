class Solution {
    private int[] dp;
    private int solve(int i,int costs[]){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int oneStep=solve(i-1,costs)+costs[i-1]+1;
        int twoStep=Integer.MAX_VALUE, threeStep=Integer.MAX_VALUE;
        if(i>=2){
            twoStep=solve(i-2,costs)+costs[i-1]+4;
        }
        if(i>=3){
            threeStep=solve(i-3,costs)+costs[i-1]+9;
        }
        return dp[i]=Math.min(threeStep, Math.min(twoStep, oneStep));
    }
    public int climbStairs(int n, int[] costs) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,costs);
    }
}
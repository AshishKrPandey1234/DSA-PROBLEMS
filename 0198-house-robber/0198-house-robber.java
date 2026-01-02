class Solution {
    private int solve(int nums[],int idx,int dp[]){
        if(idx==0)return nums[0];
        if(idx<0)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int take=nums[idx]+solve(nums,idx-2,dp);
        int notTake=solve(nums,idx-1,dp);
        return dp[idx]=Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solve(nums,n-1,dp);
    }
}
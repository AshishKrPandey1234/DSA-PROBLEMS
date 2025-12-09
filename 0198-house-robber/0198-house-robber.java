class Solution {
    public int solve(int nums[],int dp[],int i){
        if(i<0)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=nums[i]+solve(nums,dp,i-2);
        int nottake=solve(nums,dp,i-1);//here we are not taking so we will not add nums[i]that is current  value
        int result=Math.max(take,nottake);
        dp[i]=result;
        return result;
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,dp,nums.length-1);
    }
}
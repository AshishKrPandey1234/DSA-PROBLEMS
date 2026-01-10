class Solution {
    private boolean solve(int nums[],int i,int sum1,Boolean dp[][]){
        if(i<0)return false;
        if(sum1==0)return true;
        if(dp[i][sum1]!=null)return dp[i][sum1];
        boolean notTake=solve(nums,i-1,sum1,dp);
        boolean take=false;
        if(sum1>=nums[i]){
            take=solve(nums,i-1,sum1-nums[i],dp);
        }
        return dp[i][sum1]=take||notTake;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        Boolean dp[][]=new Boolean[n][sum/2+1];
        if(sum%2!=0)return false;
        return solve(nums,n-1,sum/2,dp);
    }
}
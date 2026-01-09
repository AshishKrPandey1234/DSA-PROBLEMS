class Solution {
    private boolean solve(int nums[],int i,int sum1,Boolean dp[][]){
        int n=nums.length;
        if(sum1==0)return true;
        if(i==n)return false;
        if(dp[i][sum1]!=null)return dp[i][sum1];
        boolean not_pick=solve(nums,i+1,sum1,dp);
        boolean pick=false;
        if(nums[i]<=sum1){
            pick=solve(nums,i+1,sum1-nums[i],dp);
        }
        return dp[i][sum1]=pick||not_pick;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;
        Boolean dp[][]=new Boolean[n][(sum/2)+1];
        return solve(nums,0,sum/2,dp); 
    }
}
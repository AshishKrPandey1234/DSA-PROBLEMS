class Solution {
    static int dp[][];
    private boolean solve(int nums[],int target,int i){
        if(target==0)return true;
        if(i==0){
            if(nums[0]==target)return true;
            return false;
        }
        
        if(dp[i][target]!=-1)return (dp[i][target]==1);
        boolean notTake=solve(nums,target,i-1);
        boolean take=false;
        if(nums[i]<=target){
            take=solve(nums,target-nums[i],i-1);
        }
        if(take || notTake){
            //1 indicate true
            dp[i][target]=1;
        }else{
            //0 indicate false
            dp[i][target]=0;
        }
        return take||notTake;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2==1)return false;
        //here it will only come if it is not false;
        int target=sum/2;
        dp=new int[nums.length][target+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);//not computed
        }
        return solve(nums,target,nums.length-1);
    }
}
class Solution {
    private int solve(int nums[],int i,int j){
        if(i>j)return 0;
        if(i==j)return nums[i];
        int takeI=nums[i]-solve(nums,i+1,j);
        int takeJ=nums[j]-solve(nums,i,j-1);
        return Math.max(takeI,takeJ);
    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        return solve(nums,0,n-1)>=0;
    }
}
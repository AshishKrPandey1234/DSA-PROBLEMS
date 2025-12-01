class Solution {
    private int solve(int nums[],int i,int j){
        if(i>j)return 0;
        if(i==j)return nums[i];
        int takeI=nums[i]+Math.min(solve(nums,i+2,j),solve(nums,i+1,j-1));
        int takeJ=nums[j]+Math.min(solve(nums,i,j-2),solve(nums,i+1,j-1));
        return Math.max(takeI,takeJ);
    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int totalScore=0;
        for(int ele:nums)totalScore+=ele;
        int player1_score=solve(nums,0,n-1);
        int player2_score=totalScore-player1_score;
        return player1_score>=player2_score;
    }
}
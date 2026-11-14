class Solution {
    public int maxSubArray(int[] nums) {
        int currMax=0,maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            currMax=Math.max(num, currMax+num);
            maxSum=Math.max(maxSum,currMax);
        }
        return maxSum;
    }
}
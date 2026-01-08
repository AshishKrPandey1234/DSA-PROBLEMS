class Solution {
    public int maxSubArray(int[] nums) {
        //this is kadanes algorithm where we have to keep adding things as soon as at any point by adding someththing res < current elemen from the nums array immediately replce maxEnding with current elment of array now again new subaaray start 
        int n=nums.length;
        int res=nums[0];
        int maxEnding=nums[0];
        for(int i=1;i<n;i++){
            //Either add with with the previous element or else start with new element if by adding it become lesser than nums[i]  where i current index of nums
            maxEnding=Math.max(maxEnding+nums[i],nums[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}
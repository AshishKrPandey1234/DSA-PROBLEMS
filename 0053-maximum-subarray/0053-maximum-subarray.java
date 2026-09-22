class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        //store the result (maximum result found so far)
        int res=nums[0];

        //maximum sum of subarray ending at current element
        int maxEnding=nums[0];
        for(int i=1;i<n;i++){
            //either extend the previous subarray by adding nums[i] or start new subarray
            //new subarray will only start when curr element that is nums[i] > maxEnding+nums[i]
            maxEnding=Math.max(maxEnding+nums[i],nums[i]);
            //update result id new subaray is greater and then continue finding bigger maxEnding if not get bigger maxEnding no worries the bigger maxEnding is already stored in res which will be returned later.
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}
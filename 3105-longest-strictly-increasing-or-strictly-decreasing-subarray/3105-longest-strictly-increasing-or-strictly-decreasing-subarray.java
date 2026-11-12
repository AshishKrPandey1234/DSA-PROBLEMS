class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int len1=1;
        int len2=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) len1++;
            else len1=1;
            if(nums[i]>nums[i+1]) len2++;
            else len2=1;
            max=Math.max(max,Math.max(len1,len2));
        }
        return max;
    }
}


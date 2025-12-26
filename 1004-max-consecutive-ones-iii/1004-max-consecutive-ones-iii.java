class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,maxLen=0,zeroes=0,n=nums.length;
        while(r<n){
            if(nums[r]==0)zeroes++;
            if(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            
            if(k>=zeroes){
                int len=r-l+1;
                maxLen=Math.max(len,maxLen);
            }
            r++;
        }
        return maxLen;
    }
}
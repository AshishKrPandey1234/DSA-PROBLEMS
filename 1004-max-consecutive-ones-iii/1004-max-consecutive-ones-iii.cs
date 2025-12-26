public class Solution {
    public int LongestOnes(int[] nums, int k) {
        int l=0,r=0,maxLen=0;
        int n=nums.Length;
        int zeroes=0;
        while(r<n){
            if(nums[r]==0)zeroes++;
            if(k<zeroes){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            if(k>=zeroes){
                int len=r-l+1;
                maxLen=Math.Max(len,maxLen);
            }
            
            r++;
        }
        return maxLen;
    }
}
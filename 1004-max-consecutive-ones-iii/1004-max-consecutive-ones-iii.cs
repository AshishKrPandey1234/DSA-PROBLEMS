public class Solution {
    public int LongestOnes(int[] nums, int k) {
        int n = nums.Length;
        int maxLen=0;
        for(int i=0;i<n;i++){
            int zeroes=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0) zeroes++;
                    if(zeroes<=k){
                    int len=j-i+1;
                    maxLen = Math.Max(len, maxLen);
                    }else break;

                
            }
        }
        return maxLen;
    }
}
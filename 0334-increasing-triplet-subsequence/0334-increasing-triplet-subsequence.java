class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int len=0;
        int minPrefix[]=new int[n];
        int maxSuffix[]=new int[n];
        minPrefix[0]=nums[0];
        maxSuffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            minPrefix[i]=Math.min(minPrefix[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            maxSuffix[i]=Math.max(maxSuffix[i+1],nums[i]);
        }
        for(int i=1;i<n-1;i++){
            if(minPrefix[i-1]<nums[i] && maxSuffix[i+1]>nums[i]) return true;
        }
        return false;
    }
}
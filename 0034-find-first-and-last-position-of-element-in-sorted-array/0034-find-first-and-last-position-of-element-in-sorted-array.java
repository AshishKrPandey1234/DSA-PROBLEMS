class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>=target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        int lo1=0;hi=n-1;
        while(lo1<=hi){
            int mid=lo1+(hi-lo1)/2;
            if(nums[mid]>target){
                hi=mid-1;
            }else{
                lo1=mid+1;
            }
        }
        if(lo==n || nums[lo]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{lo,lo1-1};
    }
}
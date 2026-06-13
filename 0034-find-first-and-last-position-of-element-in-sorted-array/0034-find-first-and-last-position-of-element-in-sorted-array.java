class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                int lRange=mid;
                int rRange=mid;
                while(lRange>=0 && nums[lRange]==nums[mid]){
                    lRange--;
                }
                while(rRange<nums.length && nums[rRange]==nums[mid]){
                    rRange++;
                }
                return new int[]{lRange+1,rRange-1};
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
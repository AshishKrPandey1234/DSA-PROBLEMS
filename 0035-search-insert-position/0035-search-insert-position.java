class Solution {
    public int searchInsert(int[] nums, int target) {
       //it is simply lower bound where nums[i]>=target and in upper bound nums[i]>target
       int lo=0,hi=nums.length-1;
       while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(nums[mid]>=target){
            hi=mid-1;
        }else{
            lo=mid+1;
        }
       }
       return lo; 
    }
}
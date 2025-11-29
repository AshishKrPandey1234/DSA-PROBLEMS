class Solution {
    public int search(int[] nums, int target) {
        return solve(nums,target,0,nums.length-1);
    }
    static int solve(int nums[],int target,int st,int end){
        if(st>end)return -1;
        int mid=st+(end-st)/2;
        if(nums[mid]==target)return mid;
        if(nums[st]<=nums[mid]){
            if(target>=nums[st] && target<=nums[mid]){
                return solve(nums,target,st,mid-1);
            }
            else{
                return solve(nums,target,mid+1,end);
            }
        }
        if(target>nums[mid] && target<=nums[end]){
            return solve(nums,target,mid+1,end);
        }
        return solve(nums,target,st,mid-1);
    }
}
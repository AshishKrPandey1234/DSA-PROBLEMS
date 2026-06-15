class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;//for first element
        //for middle element
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]> nums[i-1] && nums[i]>nums[i+1]) return i;
        }
        //check if the last element is peak
        if(nums[n-1]>nums[n-2]) return n-1;
        return -1;

    }
}
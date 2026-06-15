class Solution {
    public int findPeakElement(int[] nums) {
        int j=1;
        if(nums.length==2){
            if(nums[j]>nums[j-1]) return j;
                else return j-1;
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
            else if(nums[nums.length-1]>nums[nums.length-2]){
                return nums.length-1;
            }
        }
        return 0;
    }
}
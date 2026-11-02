class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        long moves=0;
        int median=nums[nums.length/2];
        for(int num:nums){
            moves+=Math.abs(median-num);
        }
        return (int)moves;
    }
}
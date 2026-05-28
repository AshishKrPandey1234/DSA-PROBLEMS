class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0;
        int size=0;
        int maxSize=0;
        while(j<nums.length){
            if(nums[j]==1){
                size++;
            }else{
                size=0;
            }
            j++;
            maxSize=Math.max(maxSize,size);
        }
        return maxSize;
    }
}
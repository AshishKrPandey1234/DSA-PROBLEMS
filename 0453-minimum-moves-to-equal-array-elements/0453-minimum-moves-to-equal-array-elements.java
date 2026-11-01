class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int ele:nums){
            sum+=ele;
            min=Math.min(min,ele);
        }
        return sum-nums.length*min;
        
    }
}
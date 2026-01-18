class Solution {
    private int solve(int nums[],int index,int currentXOR){
        if(index==nums.length)return currentXOR;
        int pick=solve(nums,index+1,currentXOR^nums[index]);
        int notpick=solve(nums,index+1,currentXOR);//if we are not picking next element than the element which is in the subset will be the currentXOR for sing element
        return pick+notpick;
    }
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }
}
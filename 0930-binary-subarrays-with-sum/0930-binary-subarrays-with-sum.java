class Solution {
    private int helper(int[] nums, int goal){
        if(goal<0)return 0;
        int l=0,r=0,n=nums.length,sum=0,count=0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal ){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);//this will calculate for sum<=goal/as we know we have to find sum==goal counts but what we will do we will find sum<=goal and sum<=goal-1 we will do substract them and get the result as we know sum<=goal-sum<goal->sum==goal
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
}
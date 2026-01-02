class Solution {
    public int solve(int nums[]){
        int n=nums.length;
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1)take+=prev2;
            int notTake=prev1;

            int curr=Math.max(take,notTake);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int temp1[]=new int[n];
        int temp2[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=0)temp1[i]=nums[i];
            if(i!=n-1)temp2[i]=nums[i];
        }
        return Math.max(solve(temp1),solve(temp2));
        
    }
}
class Solution {
    private int helper(int nums[],int k){
        int l=0,r=0,sum=0,n=nums.length,count=0;//note if number id odd than convert to 1 else convert to 9 this will be achieved when we do modulos by 2
        if(k<0)return 0;
        while(r<n){
            sum+=nums[r]%2;
            while(sum>k){
                sum-=nums[l]%2;
                l++;
            }
            //this will be done when sum<=k and second time sum<=k-1
            count+=r-l+1;
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
}
class Solution {
    private int helper(int nums[],int k){
        int n=nums.length;
        int count=0;
        int l=0,r=0;
        Map<Integer,Integer>mpp=new HashMap<>();
        while(r<n){
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
            while(mpp.size()>k){
                mpp.put(nums[l],mpp.get(nums[l])-1);
                if(mpp.get(nums[l])==0)mpp.remove(nums[l]);
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
}
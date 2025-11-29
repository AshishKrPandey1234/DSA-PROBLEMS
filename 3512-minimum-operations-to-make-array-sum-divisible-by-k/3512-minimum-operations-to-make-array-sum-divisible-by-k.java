class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int ele:nums)sum+=ele;
        if(sum%k==0)return 0;
        int rem=sum%k;
        return rem;
        
    }
}
class Solution {
    public int minOperations(int[] nums, int k) {
        int var=0;
        for(int ele:nums)
        var=(var+ele)%k;
        return var;
        
    }
}
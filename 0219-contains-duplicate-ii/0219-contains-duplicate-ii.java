class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1)break;
            for(int j=i+1;j<=k+i && j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(Math.abs(j-i)<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
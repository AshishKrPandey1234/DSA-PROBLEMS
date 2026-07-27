class Solution {
    public int maxProduct(int[] nums) {
        int l1=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;
        int s1=Integer.MAX_VALUE;
        int s2=Integer.MAX_VALUE;
        int idx1=0;
        int idx2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l1){
                l1=nums[i];
                idx1=i;
            }
            if(nums[i]<s1){
                s1=nums[i];
                idx2=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l2 && i!=idx1){
                l2=nums[i];
            }
            if(nums[i]<s2 && i!=idx2){
                s2=nums[i];
            }
        }
        return Math.max((l1-1)*(l2-1),(s1-1)*(s2-1));
        
    }
}
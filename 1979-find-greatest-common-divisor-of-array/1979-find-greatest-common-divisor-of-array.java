class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int lo=Integer.MAX_VALUE;
        int hi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            lo=Math.min(lo,nums[i]);
            hi=Math.max(hi,nums[i]);
        }
        int lcm=1;
        for(int i=hi;i<=lo*hi;i++){
            if(i%lo==0 && i%hi==0){
                lcm=i;
                break;
            }
        }
        return lo*hi/lcm;     
    }
}
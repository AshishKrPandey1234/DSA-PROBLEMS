class Solution {
    private int gcd(int a,int b){ return b==0?a:gcd(b,a%b);}
    public long gcdSum(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            nums[i]=gcd(nums[i],max);
        }
        Arrays.sort(nums);
        long res=0;
        for(int i=0,j=nums.length-1;i<j;i++,j--){
            res+=gcd(nums[i],nums[j]);
        }
        return res;
    }
}
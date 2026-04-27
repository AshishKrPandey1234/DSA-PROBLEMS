class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(mpp.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}
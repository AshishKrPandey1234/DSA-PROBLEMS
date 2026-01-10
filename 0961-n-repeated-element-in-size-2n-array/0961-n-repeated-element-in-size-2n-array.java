class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<2*n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(int key:mpp.keySet()){
            if(mpp.get(key)==n)return key;
        }
        return -1;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(int key:mpp.keySet()){
            if(mpp.get(key)==1) return key;
        }
        return -1;
    }
}
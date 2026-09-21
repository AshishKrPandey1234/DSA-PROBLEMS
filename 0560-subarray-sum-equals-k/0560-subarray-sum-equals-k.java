class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int prefix=0;
        Map<Integer,Integer>mpp=new HashMap<>();
        mpp.put(0,1);
        for(int num:nums){
            prefix+=num;
            if(mpp.containsKey(prefix-k)){
                count+=mpp.get(prefix-k);
            }
            mpp.put(prefix,mpp.getOrDefault(prefix,0)+1);
        }
        return count;

        
    }
}
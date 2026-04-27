class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(mpp.get(num)==1)
            return num;
        }
        return -1;
    }
}
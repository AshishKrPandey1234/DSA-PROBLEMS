class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                mpp.put(nums[i],mpp.get(nums[i])+1);
            }else{
                mpp.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:mpp.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
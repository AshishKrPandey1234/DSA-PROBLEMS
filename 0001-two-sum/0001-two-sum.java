class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(mpp.containsKey(complement)){
                return new int[] {mpp.get(complement),i};
            }
            //if element is not present than add to hashmap in the key value format where key is the element of nums array and value will be its index
            else{
                mpp.put(nums[i],i);
            }  
        }
        return new int[]{-1,-1};
        
    }
}
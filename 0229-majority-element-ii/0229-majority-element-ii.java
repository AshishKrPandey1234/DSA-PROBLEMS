class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>mpp=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mpp.entrySet()){
            if(entry.getValue()>nums.length/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
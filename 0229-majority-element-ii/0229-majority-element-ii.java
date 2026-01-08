class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        //we cannot do for loop here only for each loop Because HashMap is NOT index-based like an array or ArrayList.
        for(int key:mpp.keySet()){
            if(mpp.get(key)>n/3)
            ans.add(key);
        }
        return ans;
    }
}
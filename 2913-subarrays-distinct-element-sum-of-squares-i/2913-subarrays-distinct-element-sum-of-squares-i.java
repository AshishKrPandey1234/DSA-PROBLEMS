class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size(),res=0;
        for(int i=0;i<nums.size();i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(nums.get(j));
                res+=set.size()*set.size();
            }
        }
        return res;
    }
}
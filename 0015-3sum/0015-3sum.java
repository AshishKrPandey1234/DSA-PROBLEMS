class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        //if(n<3) return new ArrayList<>();
        Set<List<Integer>>ans=new HashSet<>();
        for(int i=0;i<n-2;i++){
            Set<Integer>seen=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int comp=-1*(nums[i]+nums[j]);
                if(seen.contains(comp)){
                    List<Integer>temp=new ArrayList<>(Arrays.asList(nums[i],nums[j],comp));
                    Collections.sort(temp);
                    ans.add(temp);
                }
                seen.add(nums[j]);
            }
            
        }
        return new ArrayList<>(ans);
    }
}
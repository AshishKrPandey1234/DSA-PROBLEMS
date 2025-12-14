class Solution {
    private void solve(int idx,int nums[],int n,List<Integer>subSet,Set<List<Integer>>ans){
        if(idx==n){
            ans.add(new ArrayList<>(subSet));
            return;
        }
        subSet.add(nums[idx]);
        //pick
        solve(idx+1,nums,n,subSet,ans);
        subSet.remove(subSet.size()-1);
        //not pick
        solve(idx+1,nums,n,subSet,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>ans=new HashSet<>();
        List<Integer>subSet=new ArrayList<>();
        solve(0,nums,nums.length,subSet,ans);
        return new ArrayList<>(ans);
    }
}
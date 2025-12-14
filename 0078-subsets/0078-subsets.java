class Solution {
    private void solve(int idx,int nums[],int n,List<Integer>temp,List<List<Integer>>ans){
        if(idx>=n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //pick
        temp.add(nums[idx]);
        solve(idx+1,nums,n,temp,ans);
        temp.remove(temp.size()-1);
        //not pick
        solve(idx+1,nums,n,temp,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        solve(0,nums,nums.length,temp,ans);
        return ans;
    }
}
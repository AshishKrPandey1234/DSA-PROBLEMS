class Solution {
    private void recursivePermutation(int nums[],List<Integer>ds,List<List<Integer>>ans,boolean freq[]){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));//since ds is mutable so we store its copy not its reference as if we store referce than when it will changfe as it is mutable than whole answer will be change   
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){//agar freq false hai toh we can also write if freq[i]==false both are correct
                  freq[i]=true;
                  ds.add(nums[i]);
                  recursivePermutation(nums,ds,ans,freq);
                  ds.remove(ds.size()-1);
                  freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        recursivePermutation(nums,ds,ans,freq);
        return ans;
        
    }
}
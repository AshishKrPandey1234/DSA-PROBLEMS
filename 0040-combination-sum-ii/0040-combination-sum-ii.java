class Solution {
    private void findCombination(int idx,int arr[],int target,List<List<Integer>>ans,List<Integer>temp){
        if(target==0){
        ans.add(new ArrayList<>(temp));
        return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
            temp.add(arr[i]);
            findCombination(i+1,arr,target-arr[i],ans,temp);
            temp.remove(temp.size()-1);
        }
        
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
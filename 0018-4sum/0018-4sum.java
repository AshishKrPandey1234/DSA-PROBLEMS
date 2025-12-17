class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>>ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                for(int k=j+1;k<nums.length;k++){
                    if(k>j+1 && nums[k]==nums[k-1])continue;
                    for(int m=k+1;m<nums.length;m++){
                        if(m>k+1 && nums[m]==nums[m-1])continue;
                        long sum=(long)nums[i]+nums[j]+nums[k]+nums[m];
                        
                        if(sum==target){
                            List<Integer>temp=new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[m]);
                            
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
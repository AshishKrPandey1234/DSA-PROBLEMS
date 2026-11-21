class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        if(n<4) return new ArrayList<>();
        Set<List<Integer>>ans=new HashSet<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                Set<Long>seenValues=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long fourthValue=(long)target-nums[i]-nums[j]-nums[k];
                    if(seenValues.contains(fourthValue)){
                        List<Integer>temp=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],(int)fourthValue));
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                    seenValues.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
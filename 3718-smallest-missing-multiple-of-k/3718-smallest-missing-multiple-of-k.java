class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        int curr=k;
        while(seen.contains(curr)){
            curr+=k;
        }
        return curr;
    }
}
class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int prefixSum[]=new int[n];
        int suffixSum[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                prefixSum[i] = nums[i];
            }else
            prefixSum[i] =  prefixSum[i-1] +  nums[i];
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                suffixSum[i] = nums[i];
            }else
            suffixSum[i] = suffixSum[i+1] +  nums[i];
        }
        int c=0;
        for(int i=0;i<n-1;i++){
            int diff=Math.abs(suffixSum[i+1]-prefixSum[i]);
            if(diff%2==0)c++;
        }
        return c;
        
    }
}
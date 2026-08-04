class Solution {
    static int dp[];
    private int solve(int arr[],int k,int start){
        int n=arr.length;
        if(start==n)return 0;
        if(dp[start]!=-1)return dp[start];
        int maxSum=0;
        int maxElem=0;
        for(int len=1;len<=k && start+len<=n;len++){
            maxElem=Math.max(maxElem,arr[start+len-1]);
            int currSum=maxElem*len+solve(arr,k,start+len);
            maxSum=Math.max(maxSum,currSum);
        }
        return dp[start]=maxSum;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(arr,k,0);
    }
}
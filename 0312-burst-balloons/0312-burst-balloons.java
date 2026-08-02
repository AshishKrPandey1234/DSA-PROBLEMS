class Solution {
    static int dp[][];
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int newNums[]=new int[n+2];
        newNums[0]=1;
        newNums[n+1]=1;
        for(int i=0;i<n;i++){
            newNums[i+1]=nums[i];
        }
        dp=new int[n+2][n+2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }    
        return solve(1,n,newNums);
    }
    private int solve(int i, int j, int newNums[]){
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int maxCoins=0;
        for(int k=i;k<=j;k++){
            int currCoins=newNums[i-1]*newNums[k]*newNums[j+1];
            int leftCoins=solve(i,k-1,newNums);
            int rightCoins=solve(k+1,j,newNums);
            int totalCoins=currCoins+leftCoins+rightCoins;
            maxCoins=Math.max(maxCoins,totalCoins);
        }
        return dp[i][j]=maxCoins;

    }
}
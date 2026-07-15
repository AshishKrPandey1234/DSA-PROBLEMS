class Solution {
    private int solve(int i, int j,int dp[][]){
        if(i==0 && j==0)return 1;//we reached the destination
        if(i<0 || j<0)return 0;// we crossed the limit either in row or in cols
        if(dp[i][j]!=-1)return dp[i][j];//it means if any solve function is already solved than that woud be directly returned no need to computee again so this process is called memoization
        int up=solve(i-1,j,dp);
        int left=solve(i,j-1,dp);
        return dp[i][j]=up+left;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(m-1,n-1,dp);
    }
}
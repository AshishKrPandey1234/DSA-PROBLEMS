class Solution {
    private int solve(int[][] obstacleGrid,int i,int j,int dp[][]){
        if(i>=0 && j>=0 && obstacleGrid[i][j]==1)return dp[i][j]=0;//we did check i>=0 && j>=0 because we should not check out of bound things also if (0,0)cell is 1 at that time we should not return 1 istead 0 will be returned so we can call this defensive coding practise
        if(i==0 && j==0)return dp[i][j]= 1;
        if(i<0 || j<0)return 0;

        if(dp[i][j]!=-1)return dp[i][j];//this is done to resue the value which is alrady computed no need to calculate again;
        
        int up=solve(obstacleGrid,i-1,j,dp);
        int left=solve(obstacleGrid,i,j-1,dp);
        return dp[i][j]=up+left;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(obstacleGrid,m-1,n-1,dp);

        
    }
}
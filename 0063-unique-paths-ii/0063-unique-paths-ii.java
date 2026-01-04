class Solution {
    private int solve(int[][] obstacleGrid,int i,int j){
        if(i>=0 && j>=0 && obstacleGrid[i][j]==1)return 0;
        if(i==0 && j==0)return 1;
        if(i<0 || j<0)return 0;
        
        int up=solve(obstacleGrid,i-1,j);
        int left=solve(obstacleGrid,i,j-1);
        return up+left;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        return solve(obstacleGrid,m-1,n-1);

        
    }
}
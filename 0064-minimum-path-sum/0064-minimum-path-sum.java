class Solution {
    private int solve(int dp[][],int grid[][],int i,int j){
        
        if(i==0 && j==0)return dp[i][j]=grid[0][0];
        if(i<0 || j<0)return (int) 1e9;//Java treats 1e9 as a double by default, not an int
        // We use 1e9 instead of Integer.MAX_VALUE to avoid integer overflow.
// Adding any positive value to Integer.MAX_VALUE causes overflow and wraps to Integer.MIN_VALUE (negative),
// which can break min/max comparisons and produce incorrect results.
        if(dp[i][j]!=-1)return dp[i][j];


        int up=grid[i][j]+solve(dp,grid,i-1,j);
        int left=grid[i][j]+solve(dp,grid,i,j-1);

        return dp[i][j]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(dp,grid,m-1,n-1);
    }
}
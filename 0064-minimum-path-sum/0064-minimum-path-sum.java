class Solution {
    public int minPathSum(int[][] grid) {
        int i=grid.length;
        int j=grid[0].length;
        int dp[][]=new int[i][j];
        for(int row=0;row<i;row++){
            for(int col=0;col<j;col++){
                if(row==0 && col==0)dp[row][col]=grid[row][col];
                else if(row==0)dp[row][col]=grid[row][col]+dp[row][col-1];
                else if(col==0)dp[row][col]=grid[row][col]+dp[row-1][col];
                else dp[row][col]=grid[row][col]+Math.min(dp[row-1][col],dp[row][col-1]);
            }
        }
        return dp[i-1][j-1];
        
    }
}
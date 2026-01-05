class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)dp[i][j]=grid[i][j];
                //if(i<0 || j<0)return (int)1e9;
                else{
                   int up=(i>0)?grid[i][j]+dp[i-1][j]:(int)1e9;
                   int left=(j>0)?grid[i][j]+dp[i][j-1]:(int)1e9;

                    dp[i][j]=Math.min(up,left);
                }

            }
        }
        return dp[m-1][n-1];
        
    }
}
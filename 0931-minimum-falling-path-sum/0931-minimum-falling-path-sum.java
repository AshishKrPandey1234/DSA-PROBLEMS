class Solution {
    public int minFallingPathSum(int[][] matrix) {
        //Tabulation
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        //Any falling path must start from row 0 ,So dp[0][col] = matrix[0][col]
        for(int col=0;col<n;col++){
            dp[0][col]=matrix[0][col];
        }
        for(int row=1;row<m;row++){
            for(int col=0;col<n;col++){
                int down=dp[row-1][col];
                int leftdiag=(col>0)?dp[row-1][col-1]:(int)1e9;
                int rightdiag=(col<n-1)?dp[row-1][col+1]:(int)1e9;
                dp[row][col]=matrix[row][col]+Math.min(down,Math.min(leftdiag,rightdiag));
            }
        }

        //now pick the min from the last row from the dp table as sum is done and stored in bottom so now we will print minimum one
        int minSum=(int)1e9;
        for(int col=0;col<n;col++){
            minSum=Math.min(minSum,dp[m-1][col]);
        }
        return minSum;
        
    }
}
class Solution {
    private int solve(int matrix[][],int i,int j,int dp[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        if(j>=n || j<0)return (int)1e9;
        if(i==m-1)return matrix[i][j];
        if(dp[i][j]!=(int)1e9)return dp[i][j];
        int down=matrix[i][j]+solve(matrix,i+1,j,dp);
        int leftDiag=matrix[i][j]+solve(matrix,i+1,j-1,dp);
        int rightDiag=matrix[i][j]+solve(matrix,i+1,j+1,dp);
        return dp[i][j]= Math.min(down,Math.min(leftDiag,rightDiag));

    }
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=(int)1e9;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],(int)1e9);
        }
        for(int j=0;j<n;j++){
            ans=Math.min(ans,solve(matrix,0,j,dp));
        }
        return ans;
    }
}
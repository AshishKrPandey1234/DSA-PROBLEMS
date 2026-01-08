class Solution {
    private int solve(int grid[][],int i,int j1,int j2,int dp[][][]){
        int m=grid.length;
        int n=grid[0].length;
        //check out of boundary condition
        if(j1<0||j1>=n||j2<0||j2>=n)return (int)(-1e9);
        //base case if we reach the last row
        if(i==m-1){
            return dp[i][j1][j2]= (j1==j2)?grid[i][j1]:grid[i][j1]+grid[i][j2];
        }
        //check if already computed it than return it
        if(dp[i][j1][j2]!=-1)return dp[i][j1][j2];
        int curr=(j1==j2)?grid[i][j1]:grid[i][j1]+grid[i][j2];
        int max=(int)(-1e9);
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int ans=curr+solve(grid,i+1,j1+dj1,j2+dj2,dp);
                max=Math.max(max,ans);
            }
        }
        return dp[i][j1][j2]=max;
        
    }
    public int cherryPickup(int[][] grid) {
        //since three variable changing i,j1,j2 since i is changing by+1 each time for both robert at a time but robert1 column change is independent of robert 2 column change
        int m=grid.length;//row length
        int n=grid[0].length;//column length;
        int dp[][][]=new int[m][n][n];
        for(int i=0;i<m;i++){
            for(int j1=0;j1<n;j1++){
                for(int j2=0;j2<n;j2++){
                    dp[i][j1][j2]=-1;
                }
            }
        }
        return solve(grid,0,0,n-1,dp);
    }
}
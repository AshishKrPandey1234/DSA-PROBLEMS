import java.util.*;
class Solution {
    static int dp[][][];
    static int n, m; 
    private int dfs(int i,int j,int temp,int nums[][]){
        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }
        temp^=nums[i][j];
        if(i==n-1 && j==m-1) return temp;
        if(dp[i][j][temp]!=-1)return dp[i][j][temp];
        int right=dfs(i+1, j, temp,nums);
        int down=dfs(i,j+1,temp,nums);
        return dp[i][j][temp]=Math.min(right,down);
    }
    public int minCost(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        dp=new int[n][m][1024];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<1024;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return dfs(0,0,0,grid);
    }
}
class Solution {
    private int solve(List<List<Integer>> triangle,int i,int j,int dp[][]){
        int m=triangle.size();
        if(i==m-1)return dp[i][j]= triangle.get(m-1).get(j);
        if(dp[i][j]!=1e5)return dp[i][j];
        int down=triangle.get(i).get(j)+solve(triangle,i+1,j,dp);
        int diagonal=triangle.get(i).get(j)+solve(triangle,i+1,j+1,dp);
        return dp[i][j]=Math.min(down,diagonal);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int  dp[][]=new int[m][m];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],(int)1e5);
        }
        return solve(triangle,0,0,dp);
    }
}
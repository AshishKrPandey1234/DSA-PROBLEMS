class Solution {
    static int MOD = (int)1e9+7;
    Integer dp[][][];
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp=new Integer[m][n][maxMove+1];
        return helper(m,n,maxMove,startRow,startColumn);
    }
    private int helper(int m,int n,int maxMove,int i,int j){
        if(i<0||j<0||i>=m || j>=n)return 1;
        if(maxMove==0)return 0;
        if(dp[i][j][maxMove]!=null)return dp[i][j][maxMove];
        long count=0;

        count+=helper(m,n,maxMove-1,i+1,j);//down
        count+=helper(m,n,maxMove-1,i,j-1);//left
        count+=helper(m,n,maxMove-1,i-1,j);//up
        count+=helper(m,n,maxMove-1,i,j+1);//right
        return dp[i][j][maxMove]=(int)((count)%MOD);
    }
}